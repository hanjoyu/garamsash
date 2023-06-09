package com.project.garam.pages.testimonial.controller;

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
@RequestMapping("pages/testimonial")
public class TestimonialController {

	private final CommonUtil commonUtil;

	@Autowired
	TestimonialController(CommonUtil commonUtil) {
		this.commonUtil = commonUtil;

	}

	/*
	 * author : 유한조(hanjo94@gmail.com)
	 * date : 2023. 05. 02 
	 * name : aboutMain
	 * content : 메인으로 이동
	 */
	@GetMapping("main")
	public ModelAndView aboutMain(ModelAndView mv) {
		Map<String, String> mainMap = new HashMap<>();

		mainMap.put("mainYn", "N"); 
		commonUtil.mainYn(mv, mainMap, "testimonial");

		return mv;
	}
}
