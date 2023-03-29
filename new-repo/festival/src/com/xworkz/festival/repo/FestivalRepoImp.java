package com.xworkz.festival.repo;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.excep.FestivalMemoryFullException;

public class FestivalRepoImp implements FestivalRepo {
	private FestivalDTO[] festivalDTOs = new FestivalDTO[3];
	private int festivalindex = 0;

	@Override
	public boolean save(FestivalDTO festivalDTO) throws FestivalMemoryFullException {
		if (festivalindex < festivalDTOs.length) {
			this.festivalDTOs[festivalindex] = festivalDTO;
			System.out.println("dto is saved at index :" + festivalindex + " " + festivalDTO);
			this.festivalindex++;
			return true;
		} else {
			System.err.println("memory is full");
			throw new FestivalMemoryFullException(" plz handal the exception");
		}

	}
}
