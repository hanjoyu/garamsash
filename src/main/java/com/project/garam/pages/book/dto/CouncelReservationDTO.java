package com.project.garam.pages.book.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CouncelReservationDTO {

	private String councelName; // 상담자 이름
	private String councelPhone; // 상담자 핸드폰
	private String councelType; // 상담 분류
	
}
