package com.xworkz.weapon.service;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;
import com.xworkz.weapon.repo.WeaponRepo;
import com.xworkz.weapon.util.WeaponUtil;

public class WeaponServiceImp implements WeaponService {
	private WeaponRepo weaponRepo;

	public WeaponServiceImp(WeaponRepo weaponRepo) {
		this.weaponRepo = weaponRepo;
	}

	@Override
	public boolean ValidateAndSave(WeaponDTO dto) {
		System.out.println("running ValidateAndSave in WeaponServiceImp" + dto);
		if (dto != null) {
			System.out.println("dto is not null");
			int id = dto.getId();
			String name = dto.getName();
			Type type = dto.getType();
			double cost = dto.getCost();
			String material = dto.getMaterial();
			String by = dto.getMadeBy();
			String company = dto.getManufacturedBy();
			LocalDate date = dto.getManufacturedDate();
			String usedby = dto.getUsedBy();
			String usedfor = dto.getUsedFor();
			double weight = dto.getWeight();
			boolean validid = false;
			boolean validname = false;
			boolean validtype = false;
			boolean validcost = false;
			boolean validmaterial = false;
			boolean validby = false;
			boolean validcompany = false;
			boolean validdate = false;
			boolean validusedby = false;
			boolean validusedfor = false;
			boolean validweight = false;
			if (WeaponUtil.validString(name)) {
				System.out.println("name is valid");
				validname = true;
			} else {
				System.err.println("name is invalid");
			}
			if (WeaponUtil.validInt(id)) {
				System.out.println("id is valid");
				validid = true;
			} else {
				System.err.println("id is invalid");
			}
			if (WeaponUtil.validDouble(cost)) {
				System.out.println("cost is valid");
				validcost = true;
			} else {
				System.err.println("cost is invalid");
			}
			if (WeaponUtil.validString(material)) {
				System.out.println("material is valid");
				validmaterial = true;
			} else {
				System.err.println("material is invalid");
			}
			if (WeaponUtil.validString(by)) {
				System.out.println("madeby is valid");
				validby = true;
			} else {
				System.err.println("madeby is invalid");
			}
			if (WeaponUtil.validString(company)) {
				System.out.println("manufactured by is valid");
				validcompany = true;
			} else {
				System.err.println("manufactured by is invalid");
			}
			if (WeaponUtil.validDate(date)) {
				System.out.println("manufactured date is valid");
				validdate = true;
			} else {
				System.err.println("manufactured date is invalid");
			}
			if (WeaponUtil.validString(usedby)) {
				System.out.println("usedby is valid");
				validusedby = true;
			} else {
				System.err.println("usedby is invalid");
			}
			if (WeaponUtil.validString(usedfor)) {
				System.out.println("usedfor is valid");
				validusedfor = true;
			} else {
				System.err.println("usedfor is invalid");
			}
			if (WeaponUtil.validDouble(weight)) {
				System.out.println("weight is vali");
				validweight = true;
			} else {
				System.err.println("weight is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
				validtype = true;
			} else {
				System.err.println("type is invalid");
			}
			if (WeaponUtil.valiFlag(validid, validname, validtype, validcost, validmaterial, validby, validcompany,
					validdate, validusedby, validusedfor, validweight)) {
				System.out.println("data is valid and save successfully");
				boolean save = this.weaponRepo.save(dto);
				return save;
			} else {
				System.err.println("data is invalid");
				return false;
			}
		} else {
			System.err.println("obj is null");
		}
		return false;
	}

}
