package com.project.garam.about.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.about.service.AboutService;
import com.project.garam.common.CommonConstant;
import com.project.garam.common.util.CommonUtil;

import lombok.extern.slf4j.Slf4j;
@Controller
@RequestMapping("about")
@Slf4j
public class AboutController {
	
	private final CommonUtil commonUtil;
	private final AboutService aboutService;
	
	@Autowired
	AboutController(CommonUtil commonUtil, AboutService aboutService){
		this.commonUtil = commonUtil;
		this.aboutService = aboutService;
		
	}
	
	/*
	 * author : 유한조(hanjo94@gmail.com)
	 * date : 2023. 05. 06
	 * name : aboutMain
	 * content : about page 메인 controller
	 */ 
	@GetMapping("main")
	public ModelAndView aboutMain(ModelAndView mv) {
Map<String, String> mainMap = new HashMap<>();
		
		mainMap.put("mainYn", "N");
		commonUtil.mainYn(mv, mainMap, "about");
		
		return mv;
	}
	
	public ModelAndView aboutTest(ModelAndView mv) {
aboutService.aboutTest(mv);

log.debug("=========== input Parameter ===========:: {} ", mv);
		return mv;
	}
}
