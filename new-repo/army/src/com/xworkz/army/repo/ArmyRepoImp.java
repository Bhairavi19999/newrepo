package com.xworkz.army.repo;

import com.xworkz.army.dto.ArmyDTO;

public class ArmyRepoImp implements ArmyRepo {
	private ArmyDTO[] armyDTOs = new ArmyDTO[10];
	int armyindex = 0;

	@Override
	public boolean save(ArmyDTO armyDTO) {
		if (armyindex < armyDTOs.length) {
			this.armyDTOs[armyindex] = armyDTO;
			System.out.println("dto is saved at index :" + this.armyindex + " " + armyDTO);
			this.armyindex++;
			return true;
		} else {
			System.err.println("memory is full");
		}
		return false;
	}

	@Override
	public boolean isExist(ArmyDTO dto) {
		if (armyindex == 0) {
			return false;
		} else {
			for (int index = 0; index < this.armyindex; index++) {
				ArmyDTO element = this.armyDTOs[index];
				if (element.equals(dto)) {
					return true;
				}
			}
		}
		return false;

	}

	@Override
	public ArmyDTO find(ArmyDTO dto) {
		for (int index = 0; index <armyindex; index++) {
			ArmyDTO element = this.armyDTOs[index];
			if (element.equals(dto)) {
				System.out.println("dto is found" + dto);
				return dto;
			}
		}

		return null;

	}

	@Override
	public ArmyDTO findByHeadName(String headname) {
		for (int index = 0; index <armyindex; index++) {
			ArmyDTO element = this.armyDTOs[index];
			if (element.getHeadName().equals(headname)) {
				System.out.println("name is presnt:" + headname);
				return element;
			}

		}
		return null;
	}

	@Override
	public String findHeadNameByOperationName(String opertionname) {
		for (int index = 0; index < this.armyDTOs.length; index++) {
			ArmyDTO element = this.armyDTOs[index];
			if (element.getOperationName().equals(opertionname)) {
				System.out.println("opertion name is found" + opertionname);
				return element.getHeadName();
			}

		}
		return null;
	}
}
