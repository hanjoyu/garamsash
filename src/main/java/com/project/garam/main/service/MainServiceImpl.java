package com.project.garam.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.garam.main.dto.mainDTO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MainServiceImpl {

	private MainMapper mainMapper;

	@Autowired
	MainServiceImpl(MainMapper mainMapper) {
		this.mainMapper = mainMapper;
	}

	public void tester() {
		mainDTO mainDto = new mainDTO();
		mainDto.setEmpno(99);
		mainDto.setEname("test1");
		mainDto.setJob("tester");

		mainDTO mainDto2 = new mainDTO();
		mainDto2.setEmpno(99);
		mainDto2.setEname("test33");
		mainDto2.setJob("tester333");
		mainDto2 = mainMapper.test2();
		
//		System.out.println("zzzzzzzzzz"+ mainDto2.toString());
		log.debug("aaaaaaaaaaaaaaaa");
		log.debug(mainDto2.toString());
	}

}
