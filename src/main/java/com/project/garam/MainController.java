package com.project.garam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.garam.common.CommonRoot;

@Controller
public class MainController {
	
	@GetMapping(value= {"/", "/main"})
	public String main() {

		return CommonRoot.MAIN_ROOT + "main";
	}
}
