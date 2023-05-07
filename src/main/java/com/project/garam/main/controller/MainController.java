package com.project.garam.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.util.CommonUtil;
import com.project.garam.main.service.MainService;
import com.project.garam.main.service.MainServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

	private final MainService mainService;
	private final CommonUtil commonUtil;
	
	@Autowired
	MainController(MainServiceImpl mainService, CommonUtil commonUtil){
		this.mainService = mainService;
		this.commonUtil = commonUtil;
	}
	
	/*
	 * author : 유한조(hanjo94@gmail.com)
	 * date : 2023. 05. 07
	 * name : main
	 * content : main으로 가는 controller
	 */
	@GetMapping(value= {"/", "/main"})
	public ModelAndView main(ModelAndView mv) {
		
		Map<String, String> mainMap = new HashMap<>();

		/* main 메서드 빼내기 */
		mainMap.put("mainYn", "Y");
		commonUtil.mainYn(mv, mainMap, "main");
		mainService.selectAllEmployee();

		return mv;
	}
}
