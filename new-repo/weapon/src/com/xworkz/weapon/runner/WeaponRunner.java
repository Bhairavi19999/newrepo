package com.xworkz.weapon.runner;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;
import com.xworkz.weapon.repo.WeaponRepo;
import com.xworkz.weapon.repo.WeaponRepoImp;
import com.xworkz.weapon.service.WeaponService;
import com.xworkz.weapon.service.WeaponServiceImp;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weaponDTO = new WeaponDTO(9, "PoliceGun", Type.PISTOL, 5000, "carbon", "Eningneer", "TATA",
				LocalDate.now(), "police", "protection", 300);
		WeaponRepo weaponRepo = new WeaponRepoImp();
		WeaponService weapon = new WeaponServiceImp(weaponRepo);
		System.out.println("saved:" + weapon.ValidateAndSave(weaponDTO));

		WeaponDTO weaponDTO1 = new WeaponDTO(9, "PoliceGun", Type.PISTOL, 5000, "carbon", "Eningneer", "TATA",
				LocalDate.now(), "police", "protection", 300);
		WeaponRepo weaponRepo1 = new WeaponRepoImp();
		WeaponService weapon1 = new WeaponServiceImp(weaponRepo1);
		System.out.println("saved:" + weapon.ValidateAndSave(weaponDTO1));

		WeaponDTO weaponDTO2 = new WeaponDTO(9, "PoliceGun", Type.PISTOL, 5000, "carbon", "Eningneer", "TATA",
				LocalDate.now(), "police", "protection", 300);
		WeaponRepo weaponRepo2 = new WeaponRepoImp();
		WeaponService weapon2 = new WeaponServiceImp(weaponRepo2);
		System.out.println("saved:" + weapon.ValidateAndSave(weaponDTO2));
		
		
		WeaponDTO weaponDTO3 = new WeaponDTO(9, "PoliceGun", Type.PISTOL, 5000, "carbon", "Eningneer", "TATA",
				LocalDate.now(), "police", "protection", 300);
		WeaponRepo weaponRepo3 = new WeaponRepoImp();
		WeaponService weapon3 = new WeaponServiceImp(weaponRepo3);
		System.out.println("saved:" + weapon.ValidateAndSave(weaponDTO3));


		
	}

}
