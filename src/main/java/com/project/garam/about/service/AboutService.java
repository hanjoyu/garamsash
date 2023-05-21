package com.project.garam.about.service;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.util.CommonUtil;
@Service
public class AboutService {
	
	private final CommonUtil commonUtil;
	
	@Autowired
	AboutService(CommonUtil commonUtil){
		this.commonUtil = commonUtil;
		
	}
	
	public ModelAndView aboutTest(ModelAndView mv) {
		mv.addObject("firstTest", "test1");
		
		return mv;
	}
}
