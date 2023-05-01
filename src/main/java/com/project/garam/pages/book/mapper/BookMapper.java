package com.project.garam.pages.book.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.project.garam.pages.book.dto.CouncelReservationDTO;

@Mapper
public interface BookMapper {
	
	int insertCouncelReservation(CouncelReservationDTO inputDto);
}
