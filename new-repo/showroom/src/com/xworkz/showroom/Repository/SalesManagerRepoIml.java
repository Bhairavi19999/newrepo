package com.xworkz.showroom.Repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.Service.SalesManagerService;
import com.xworkz.showroom.dto.PolishDTO;
import com.xworkz.showroom.dto.SalesManagerDTO;
@Component
public class SalesManagerRepoIml implements SalesManagerRepo {
	Collection<SalesManagerDTO> salesManagerDTOs = new ArrayList<>();

	public SalesManagerRepoIml(Collection<SalesManagerDTO> salesManagerDTOs) {
		this.salesManagerDTOs = salesManagerDTOs;

	}

	public SalesManagerRepoIml() {
		System.out.println("no arg const.....");
	}

	@Override
	public boolean save(SalesManagerDTO salesManagerDTO) {
		return this.salesManagerDTOs.add(salesManagerDTO);
	}

}
