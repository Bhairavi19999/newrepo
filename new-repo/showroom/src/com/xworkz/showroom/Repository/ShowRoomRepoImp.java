package com.xworkz.showroom.Repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowRoomDTO;
@Component
public class ShowRoomRepoImp implements ShowRoomRepo {
	Collection<ShoeShowRoomDTO> shoeShowRoomDTOs = new ArrayList<ShoeShowRoomDTO>();

	@Override
	public boolean save(ShoeShowRoomDTO showRoomDTO) {
		return shoeShowRoomDTOs.add(showRoomDTO);

	}

}
