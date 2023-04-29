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
		mainDto.setEmpno(98);
		mainDto.setEname("test1");
		mainDto.setJob("tester");

		mainDTO mainDto2 = new mainDTO();
		mainDto2.setEmpno(90);
		mainDto2.setEname("tset2");
		mainDto2.setJob("tester222");
		mainDto2 = mainMapper.test2();
		
		mainDTO mainDto3 = new mainDTO();
		mainDto3.setEmpno(90);
		mainDto3.setEname("test33");
		mainDto3.setJob("tester333");
		mainDto3 = mainMapper.test2();
		
//		System.out.println("zzzzzzzzzz"+ mainDto2.toString());
		log.debug("aaaaaaaaaaaaaaaa");
		log.debug(mainDto2.toString());
	}

}
