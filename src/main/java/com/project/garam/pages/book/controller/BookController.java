package com.project.garam.pages.book.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.garam.common.CommonConstant;
import com.project.garam.common.dto.ResultDTO;
import com.project.garam.common.util.CommonUtil;
import com.project.garam.pages.book.dto.CouncelReservationDTO;
import com.project.garam.pages.book.service.BookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("pages/book")
@Slf4j
public class BookController {

	private final CommonUtil commonUtil;
	private final ResultDTO resultDTO;
	private final BookService bookService;

	@Autowired
	BookController(CommonUtil commonUtil, ResultDTO resultDTO, BookService bookService) {
		this.commonUtil = commonUtil;
		this.resultDTO = resultDTO;
		this.bookService = bookService;
	}

	/*
	 * author : 유한조(hanjo94@gmail.com)
	 * date : 2023. 05. 01 
	 * name : aboutMain
	 * content : about 메인으로 이동
	 */
	@GetMapping("main")
	public ModelAndView aboutMain(ModelAndView mv) {
		Map<String, String> mainMap = new HashMap<>();

		mainMap.put("mainYn", "N");
		commonUtil.mainYn(mv, mainMap, "book");

		return mv;
	}

	/*
	 * author : 유한조(hanjo94@gmail.com)
	 * date : 2023. 05. 01 
	 * name : insertCouncelReservation
	 * content : 상담 예약을 insert한다.
	 */
	@PostMapping("councelReservation")
	public ResultDTO insertCouncelReservation(CouncelReservationDTO inputDTO, ModelAndView mv) {
		log.info("Controller insertCouncelReservation param : {}", inputDTO.toString());
		
		try {
			int rslt = bookService.insertCouncelReservation(inputDTO);
			log.info("Controller insertCouncelReservation rslt : {}", rslt);
			
			if (rslt > 0) {
				resultDTO.setResultCd(CommonConstant.RESULT_CD_SUCCESS);
				resultDTO.setResultMsg(CommonConstant.RESULT_MSG_SUCCESS);

			} else {
				resultDTO.setResultCd(CommonConstant.RESULT_CD_FAIL);
				resultDTO.setResultMsg(CommonConstant.RESULT_MSG_FAIL);
			}

		} catch (Exception e) {
			resultDTO.setResultCd(CommonConstant.RESULT_CD_FAIL);
			resultDTO.setResultMsg(e.getMessage());

			return resultDTO;

		}
		return resultDTO;

	}
}
