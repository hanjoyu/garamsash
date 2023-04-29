package com.project.garam.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.CommonRoot;
import com.project.garam.main.service.MainServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

	private MainServiceImpl mainService;
	
	@Autowired
	MainController(MainServiceImpl mainService){
		this.mainService = mainService;
	}
	
	@GetMapping(value= {"/", "/main"})
	public ModelAndView main(ModelAndView mv) {
		
		Map<String, String> mainMap = new HashMap<>();

		/* main 메서드 빼내기 */
		mainMap.put("mainYn", "Y");
		mv.addObject("mainParam", mainMap);
		mv.setViewName(CommonRoot.MAIN_ROOT + "main");
		mainService.tester();

		return mv;
	}
}
