package com.xworkz.army.repo;

import com.xworkz.army.dto.ArmyDTO;

public interface ArmyRepo {
	boolean save(ArmyDTO armyDTO);

	boolean isExist(ArmyDTO dto);

	ArmyDTO find(ArmyDTO dto);

	ArmyDTO findByHeadName(String headname);

	String findHeadNameByOperationName(String operation);

}
