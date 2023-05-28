package com.project.garam.about.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AddStaffDTO {

	public String name;
	public String phone;
	public String Birth;
	public String gender;
	public String Address;
	public String content;
}
