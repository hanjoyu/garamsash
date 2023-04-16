package com.project.garam;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.CommonRoot;

import ch.qos.logback.core.model.Model;

@Controller
public class MainController {
	
	@GetMapping(value= {"/", "/main"})
	public ModelAndView main(ModelAndView mv) {

		Map<String, String> mainMap = new HashMap<>();
		
		mainMap.put("mainYn", "Y");
		mv.addObject("mainParam", mainMap);
		mv.setViewName(CommonRoot.MAIN_ROOT + "main");
		
		return mv;
	}
}
