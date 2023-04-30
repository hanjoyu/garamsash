package com.project.garam.common.util;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.CommonRoot;

public class CommonUtil {

	public ModelAndView mainYn(ModelAndView mv, Map<String, String> mainMap) {
		
		mv.addObject("mainParam", mainMap);
		mv.setViewName(CommonRoot.MAIN_ROOT + "main");
		
		return mv; 
	}
	
}
