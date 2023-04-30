package com.project.garam.main.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.project.garam.main.dto.MainDTO;

@Mapper
public interface MainMapper {
	
	MainDTO selectAllEmployee();
}
