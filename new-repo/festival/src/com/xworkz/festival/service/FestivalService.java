package com.xworkz.festival.service;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.excep.InvalidFestivalException;

public interface FestivalService {
	boolean ValidateAndSave(FestivalDTO dto) throws InvalidFestivalException;

}
