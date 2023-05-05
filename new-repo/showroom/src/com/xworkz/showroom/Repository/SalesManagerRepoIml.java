package com.xworkz.showroom.Repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.showroom.Service.SalesManagerService;
import com.xworkz.showroom.dto.PolishDTO;
import com.xworkz.showroom.dto.SalesManagerDTO;

public class SalesManagerRepoIml implements SalesManagerService {
	Collection<SalesManagerDTO> salesManagerDTOs = new ArrayList<>();

	public SalesManagerRepoIml(Collection<SalesManagerDTO> salesManagerDTOs) {
		this.salesManagerDTOs = salesManagerDTOs;

	}

	public SalesManagerRepoIml() {
		System.out.println("no arg const.....");
	}

	@Override
	public boolean validandsave(SalesManagerDTO dto) {
		return salesManagerDTOs.add(dto);
	}

}
