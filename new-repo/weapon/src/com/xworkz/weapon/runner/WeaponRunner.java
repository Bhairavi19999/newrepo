package com.xworkz.weapon.runner;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;
import com.xworkz.weapon.service.WeaponService;
import com.xworkz.weapon.service.WeaponServiceImp;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weaponDTO = new WeaponDTO(9, "PoliceGun", Type.PISTOL, 5000, "carbon", "Eningneer", "TATA",
				LocalDate.of(2010, 10, 10), "police", "protection", 300);
		WeaponService weapon=new WeaponServiceImp();
		System.out.println("saved:" + weapon.ValidateAndSave(weaponDTO));
	}

}
