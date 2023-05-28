package com.project.garam.construction.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.CommonConstant;
import com.project.garam.common.util.CommonUtil;
@Controller
@RequestMapping("construction")
public class ConstructionController {
	private final CommonUtil commonUtil;
	
	@Autowired
	ConstructionController(CommonUtil commonUtil){
		this.commonUtil = commonUtil;
	}
	
	/*
	 * author : 유한조(hanjo94@gmail.com)
	 * date : 2023. 05. 07
	 * name : aboutMain
	 * content : about main을 위한 controller
	 */
	@GetMapping("main")
	public ModelAndView constructionMain(ModelAndView mv) {
Map<String, String> mainMap = new HashMap<>();
		
		mainMap.put("mainYn", "N");
		commonUtil.mainYn(mv, mainMap, "construction");
		
		return mv;
	}
}
