package com.project.garam.pages.team.controller;


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
@RequestMapping("pages/team")
public class TeamController {
	
	private final CommonUtil commonUtil;
	
	@Autowired
	public TeamController(CommonUtil commonUtil) {
		this.commonUtil = commonUtil;
	}
	
	@GetMapping("main")
	public ModelAndView aboutMain(ModelAndView mv) {
Map<String, String> mainMap = new HashMap<>();
		
		mainMap.put("mainYn", "N"); // main N
		commonUtil.mainYn(mv, mainMap, "team");
		
		return mv;
	}
}
