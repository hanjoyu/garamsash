package com.project.garam.contact.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.CommonRoot;
import com.project.garam.common.util.CommonUtil;

@Controller
@RequestMapping("contact")
public class ContactController {

	private final CommonUtil commonUtil;

	@Autowired
	public ContactController(CommonUtil commonUtil) {
		this.commonUtil = commonUtil;
	}

	@GetMapping("main")
	public ModelAndView aboutMain(ModelAndView mv) {
		Map<String, String> mainMap = new HashMap<>();

		mainMap.put("mainYn", "N");
		commonUtil.mainYn(mv, mainMap, "contact");

		return mv;
	}
}
