package com.project.garam.pages.team.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.CommonRoot;
@Controller
@RequestMapping("pages/team")
public class TeamController {
	
	@GetMapping("main")
	public ModelAndView aboutMain(ModelAndView mv) {
Map<String, String> mainMap = new HashMap<>();
		
		mainMap.put("mainYn", "N");
		mv.addObject("mainParam", mainMap);
		mv.setViewName(CommonRoot.MAIN_ROOT + "team");
		
		return mv;
	}
}
