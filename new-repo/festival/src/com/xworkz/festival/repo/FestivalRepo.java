package com.xworkz.festival.repo;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.excep.FestivalMemoryFullException;

public interface FestivalRepo {
	boolean save(FestivalDTO festivalDTO) throws FestivalMemoryFullException;

}
