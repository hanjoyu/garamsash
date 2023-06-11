package com.project.garam.testpage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.util.CommonUtil;
import com.project.garam.main.service.MainServiceImpl;
import com.project.garam.testpage.dto.TestDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("testpage")
public class TestPageController {

//	private final MainService mainService;
	private final CommonUtil commonUtil;
	
	@Autowired
	TestPageController(MainServiceImpl mainService, CommonUtil commonUtil){
//		this.mainService = mainService;
		this.commonUtil = commonUtil;
	}
	
	/*
	 * author : 유한조(hanjo94@gmail.com)
	 * date : 2023. 05. 07
	 * name : main
	 * content : main으로 가는 controller
	 */
	@GetMapping(value= {"/", "/main"})
	public ModelAndView main(ModelAndView mv) {
		List<TestDTO> returnList = new ArrayList<>();
		TestDTO testDTO = new TestDTO();
		
		for(int i = 0; i < 50; i ++) {
			
			testDTO = new TestDTO();
			this.setTestDTO(testDTO);
			returnList.add(testDTO);
		}
		
		mv.setViewName("/main/testpage");
        mv.addObject("returnDTO", testDTO);
        mv.addObject("returnList", returnList);
		return mv;
	}
	
	public void setTestDTO(TestDTO testDTO) {
		String subStr = "0123456789";
		subStr = subStr.substring(1, 5);
		testDTO.setA("1");
		testDTO.setB("2");
		testDTO.setC("3");
		testDTO.setD("4");
		testDTO.setE("5");
		testDTO.setF("6");
//		testDTO.setG(subStr);
		
//		return testDTO;
	}
}
