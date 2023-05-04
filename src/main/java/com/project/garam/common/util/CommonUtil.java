package com.project.garam.common.util;

import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.CommonConstant;

@Component

public class CommonUtil {

	public ModelAndView mainYn(ModelAndView mv, Map<String, String> mainMap, String viewName) {

		String forPage = "";
		if ("book".equals(viewName) || "team".equals(viewName) || "testimonial".equals(viewName)) {
			forPage = "pages";
			mainMap.put("viewName", forPage);
			
		} else {
			mainMap.put("viewName", viewName);

		}
		mv.addObject("mainParam", mainMap);
		mv.setViewName(CommonConstant.MAIN_ROOT + viewName);

		return mv;
	}

}
