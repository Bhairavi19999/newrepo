package com.xworkz.weapon.service;

import java.time.LocalDate;

import com.xworkz.weapon.constant.Type;
import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponServiceImp implements WeaponService {

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
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("name is valid");
				validname = true;
			} else {
				System.err.println("name is invalid");
			}
			if (id > 0 && id < 10) {
				System.out.println("id is valid");
				validid = true;
			} else {
				System.err.println("id is invalid");
			}
			if (cost > 100 && cost < 100000) {
				System.out.println("cost is valid");
				validcost = true;
			} else {
				System.err.println("cost is invalid");
			}
			if (material != null && !material.isEmpty() && material.length() > 3 && material.length() < 30) {
				System.out.println("material is valid");
				validmaterial = true;
			} else {
				System.err.println("material is invalid");
			}
			if (by != null && !by.isEmpty() && by.length() > 3 && by.length() < 30) {
				System.out.println("madeby is valid");
				validby = true;
			} else {
				System.err.println("madeby is invalid");
			}
			if (company != null && !company.isEmpty() && company.length() > 3 && company.length() < 30) {
				System.out.println("manufactured by is valid");
				validcompany = true;
			} else {
				System.err.println("manufactured by is invalid");
			}
			LocalDate past = LocalDate.of(2000, 8, 20);
			if (date != null && date.isAfter(past)) {
				System.out.println("manufactured date is valid");
				validdate = true;
			} else {
				System.err.println("manufactured date is invalid");
			}
			if (usedby != null && !usedby.isEmpty() && usedby.length() > 3 && usedby.length() < 30) {
				System.out.println("usedby is valid");
				validusedby = true;
			} else {
				System.err.println("usedby is invalid");
			}
			if (usedfor != null && !usedfor.isEmpty() && usedfor.length() > 3 && usedfor.length() < 30) {
				System.out.println("usedfor is valid");
				validusedfor = true;
			} else {
				System.err.println("usedfor is invalid");
			}
			if (weight > 0 && weight < 500) {
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
			if (validid && validname && validtype && validcost && validmaterial && validby && validcompany && validdate
					&& validusedby && validusedfor && validweight) {
				System.out.println("data is valid and save successfully");
				return true;
			} else {
				System.err.println("data is invalid");
				return false;
			}
		} else

		{
			System.err.println("obj is null");
		}
		return false;
	}

}
