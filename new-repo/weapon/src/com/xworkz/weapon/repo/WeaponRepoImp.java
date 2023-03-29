package com.xworkz.weapon.repo;

import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponRepoImp implements WeaponRepo {
	private WeaponDTO[] weaponDTOs = new WeaponDTO[3];
	private int weaponindex = 0;

	@Override
	public boolean save(WeaponDTO weaponDTO) {
		if (weaponindex < weaponDTOs.length) {
			this.weaponDTOs[weaponindex] = weaponDTO;
			//System.out.println("dto is saved at index :" + weaponindex + " " + weaponDTO);
			this.weaponindex++;
			return true;
		} else {
			System.err.println("memory is full");
		}

		return false;
	}

}
