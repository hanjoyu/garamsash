package com.project.garam.about.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.garam.common.CommonRoot;
@Controller
@RequestMapping("about")
public class AboutController {
	
	@GetMapping("main")
	public String aboutMain() {
		
		return CommonRoot.MAIN_ROOT + "about";
	}
}
