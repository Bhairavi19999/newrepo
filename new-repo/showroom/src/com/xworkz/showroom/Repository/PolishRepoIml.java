package com.xworkz.showroom.Repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.PolishDTO;

@Component
public class PolishRepoIml implements PolishRepo {
	Collection<PolishDTO> polishDTOs = new ArrayList<>();

	public PolishRepoIml() {
		System.out.println("no arg const.....");
	}

	@Override
	public boolean save(PolishDTO polishDTO) {
		return this.polishDTOs.add(polishDTO);
	}

}
