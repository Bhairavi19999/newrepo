package com.xworkz.army.runner;

import com.xworkz.army.dto.ArmyDTO;
import com.xworkz.army.repo.ArmyRepo;
import com.xworkz.army.repo.ArmyRepoImp;
import com.xworkz.army.service.ArmyService;
import com.xworkz.army.service.ArmyServiceImp;

public class ArmyRunner {

	public static void main(String[] args) {
		ArmyDTO armyDTO = new ArmyDTO("rana pratap", 10, 50000, "Protection", 8);
		ArmyDTO armyDTO2 = new ArmyDTO("major ram", 20, 3000, "defence", 3);
		ArmyDTO armyDTO3 = new ArmyDTO("major shree", 40, 60000, "security", 12);
		ArmyDTO armyDTO4 = new ArmyDTO("major shree", 40, 60000, "security", 12);

		ArmyRepo ref = new ArmyRepoImp();
		ArmyService service = new ArmyServiceImp(ref);

		boolean save = service.validateAndSave(armyDTO);
		System.out.println("saved:" + save);

		boolean save2 = service.validateAndSave(armyDTO2);
		System.out.println("saved:" + save2);

		boolean save3 = service.validateAndSave(armyDTO3);
		System.out.println("save:" + save3);

		boolean save4 = service.validateAndSave(armyDTO4);
		System.out.println("save:" + save4);

		service.find(armyDTO);
		service.findByHeadName("major ram");
		System.out.println(service.findHeadNameByOperationName("Protection"));

	}

}
