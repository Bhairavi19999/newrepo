package com.xworkz.army.service;

import com.xworkz.army.dto.ArmyDTO;

public interface ArmyService {
	boolean validateAndSave(ArmyDTO dto);

	boolean isExist(ArmyDTO dto);

	ArmyDTO find(ArmyDTO dto);

	ArmyDTO findByHeadName(String headname);

	String findHeadNameByOperationName(String opertionname);

}
