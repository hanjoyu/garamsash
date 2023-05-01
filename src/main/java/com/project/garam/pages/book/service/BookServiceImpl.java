package com.project.garam.pages.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.garam.pages.book.dto.CouncelReservationDTO;
import com.project.garam.pages.book.mapper.BookMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

	private final BookMapper bookMapper;

	@Autowired
	BookServiceImpl(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	/*
	 * author : 유한조(hanjo94@gmail.com)
	 * date : 2023. 05. 01 
	 * name : insertCouncelReservation
	 * content : 상담 예약을 insert한다.
	 */
	@Override
	@Transactional
	public int insertCouncelReservation(CouncelReservationDTO inputDTO) {
		log.info("Service insertCouncelReservation param : {}", inputDTO.toString());
		int rslt = bookMapper.insertCouncelReservation(inputDTO);
		
		log.info("Service insertCouncelReservation rslt : {}", rslt);
		return rslt;

	}

}
