package com.xworkz.desert.repo;

import com.xworkz.desert.dto.DesertDTO;

public interface DesertRepo {
	boolean save(DesertDTO desertDTO);

	DesertDTO find(DesertDTO dto);

	DesertDTO findByName(String name);

	DesertDTO findAreaByName(String name);

	DesertDTO findByNameAndCountryAndArea(String name, String country, String area);

	int total();

}
