package com.xworkz.army.service;

import com.xworkz.army.dto.ArmyDTO;
import com.xworkz.army.repo.ArmyRepo;
import com.xworkz.army.util.ArmyUtil;

public class ArmyServiceImp implements ArmyService {
	public ArmyRepo armyRepo;

	public ArmyServiceImp(ArmyRepo armyRepo) {
		this.armyRepo = armyRepo;
	}

	@Override
	public boolean validateAndSave(ArmyDTO dto) {
		System.out.println(" running validate and save in army imp");

		if (dto != null) {
			System.out.println("dto is not null" + dto);
			String headName = dto.getHeadName();
			int totalMember = dto.getTotalMembers();
			double salary = dto.getSalary();
			String operationName = dto.getOperationName();
			int memberInOper = dto.getMemberInOper();
			boolean validheadName = false;
			boolean validtotalMember = false;
			boolean validsalary = false;
			boolean validoperationName = false;
			boolean validmemberInOper = false;

			if (ArmyUtil.validString(headName)) {
				System.out.println("name is valid");
				validheadName = true;
			} else {
				System.err.println("name is invalid");

			}
			if (ArmyUtil.validInt(totalMember)) {
				System.out.println("total member is valid");
				validtotalMember = true;
			} else {
				System.err.println("total member is invalid");
			}
			if (ArmyUtil.validnumber(salary)) {
				System.out.println("salary is valid");
				validsalary = true;
			} else {
				System.out.println("salary is invalid");
			}
			if (ArmyUtil.validString(operationName)) {
				System.out.println("operation name is valid");
				validoperationName = true;
			} else {
				System.err.println("operation name is invalid");
			}
			if (ArmyUtil.validInt(memberInOper)) {
				System.out.println("memberInOper is valid");
				validmemberInOper = true;
			} else {
				System.err.println("memberInOper is invalid");

			}
			if (ArmyUtil.valiFlag(validheadName, validtotalMember, validsalary, validoperationName,
					validmemberInOper)) {
				if (!armyRepo.isExist(dto)) {
					System.out.println("data is valid");
					boolean save = this.armyRepo.save(dto);
					return save;
				}

			}
		} else {
			System.err.println("dto is null");
		}
		return false;
	}

	@Override
	public boolean isExist(ArmyDTO dto) {

		return armyRepo.isExist(dto);
	}

	@Override
	public ArmyDTO find(ArmyDTO dto) {
		if(dto!=null) {
		return armyRepo.find(dto);
		}
		return null;
	}

	@Override
	public ArmyDTO findByHeadName(String headname) {
		if (ArmyUtil.validString(headname)) {
			return armyRepo.findByHeadName(headname);
		}
		return null;
	}

	@Override
	public String findHeadNameByOperationName(String opertionname) {
		if (ArmyUtil.validString(opertionname)) {
			return this.armyRepo.findHeadNameByOperationName(opertionname);
		}
		return null;
	}

}
