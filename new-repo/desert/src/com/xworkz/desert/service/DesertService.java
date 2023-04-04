package com.xworkz.desert.service;

import com.xworkz.desert.dto.DesertDTO;

public interface DesertService {
	boolean validAndSave(DesertDTO dto);

	DesertDTO find(DesertDTO dto);

	DesertDTO findByName(String name);

	DesertDTO findAreaByName(String name);

	DesertDTO findByNameAndCountryAndArea(String name, String country, String area);

	int total();

}
