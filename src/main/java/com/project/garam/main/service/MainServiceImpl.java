package com.project.garam.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.garam.main.dto.MainDTO;
import com.project.garam.main.mapper.MainMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MainServiceImpl implements MainService{

	private final MainMapper mainMapper;
	
	@Autowired
	MainServiceImpl(MainMapper mainMapper) {
		this.mainMapper = mainMapper;
	}
	
	@Override
	public MainDTO selectAllEmployee(){
		MainDTO mainDto = new MainDTO();
		
		mainDto = mainMapper.selectAllEmployee();
		
		log.info("======= ======= rslt {} ======= ======= ", mainDto.toString());
		return mainDto;
		
	}



}
