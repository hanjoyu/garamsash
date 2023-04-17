package com.project.garam.services.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.CommonRoot;
@Controller
@RequestMapping("services")
public class ServicesController {
	
	@GetMapping("main")
	public ModelAndView aboutMain(ModelAndView mv) {
Map<String, String> mainMap = new HashMap<>();
		
		mainMap.put("mainYn", "N");
		mv.addObject("mainParam", mainMap);
		mv.setViewName(CommonRoot.MAIN_ROOT + "services");
		
		return mv;
	}
}
