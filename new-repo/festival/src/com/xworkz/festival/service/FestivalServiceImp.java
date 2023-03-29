package com.xworkz.festival.service;

import java.time.LocalDate;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.excep.InvalidFestivalException;
import com.xworkz.festival.repo.FestivalRepo;
import com.xworkz.festival.util.FestivalUtil;

public class FestivalServiceImp implements FestivalService {
	private FestivalRepo festivalRepo;

	public FestivalServiceImp(FestivalRepo festivalRepo) {
		this.festivalRepo = festivalRepo;
	}

	@Override
	public boolean ValidateAndSave(FestivalDTO dto) throws InvalidFestivalException {
		System.out.println("running ValidateAndSave in FestivalServiceImp" + dto);
		if (dto != null) {
			int id = dto.getId();
			String name = dto.getName();
			String sweet = dto.getSweet();
			String godName = dto.getGodName();
			LocalDate startDate = dto.getStartDate();
			LocalDate endDate = dto.getEndDate();
			boolean validid = false;
			boolean validname = false;
			boolean validsweet = false;
			boolean validgodName = false;
			boolean validstartDate = false;
			boolean validendDate = false;
			if (FestivalUtil.validString(name)) {
				System.out.println("name is valid");
				validname = true;
			} else {
				System.err.println("name is invalid");
			}
			if (FestivalUtil.validInt(id)) {
				System.out.println("id is valid");
				validid = true;
			} else {
				System.err.println("id is invalid");
			}
			if (FestivalUtil.validString(sweet)) {
				System.out.println("sweet is valid");
				validsweet = true;
			} else {
				System.err.println("sweet is invalid");
			}
			if (FestivalUtil.validString(godName)) {
				System.out.println("godName is valid");
				validgodName = true;
			} else {
				System.err.println("godName is invalid");
			}
			if (FestivalUtil.validDate(endDate)) {
				System.out.println("end date is valid");
				validendDate = true;
			} else {
				System.err.println("end date is invalid");
			}
			if (FestivalUtil.validDate(startDate)) {
				System.out.println("startDate is valid");
				validstartDate = true;
			} else {
				System.err.println("startDate is invalid");
			}
			if (FestivalUtil.valiFlag(validid, validname, validendDate, validgodName, validstartDate, validsweet)) {
				System.out.println("data is valid and save successfully");
				boolean save = this.festivalRepo.save(dto);
				return save;
			} else {
				System.err.println("data is invalid");
				throw new InvalidFestivalException("handle the exception");
			}
			
		} else {
			System.err.println("obj is null");
		}

		return false;

	}
}
