package com.xworkz.showroom.Repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowRoomDTO;

@Component
public class ShowRoomRepoImp implements ShowRoomRepo {
	private Collection<ShoeShowRoomDTO> shoeShowRoomDTOs = new ArrayList<>();

	public ShowRoomRepoImp() {
		System.out.println("ShowRoomRepoImp running in no arg const.....");
	}

	@Override
	public boolean save(ShoeShowRoomDTO shoeShowRoomDTO) {
		return this.shoeShowRoomDTOs.add(shoeShowRoomDTO);

	}

}
