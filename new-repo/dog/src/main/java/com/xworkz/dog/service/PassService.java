package com.xworkz.dog.service;

import com.xworkz.dog.dto.PassportDTO;

public interface PassService {
	boolean validateAndSave(PassportDTO dto);

}
