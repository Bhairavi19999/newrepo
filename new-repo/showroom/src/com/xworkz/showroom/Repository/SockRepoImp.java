package com.xworkz.showroom.Repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.SockDTO;
@Component
public class SockRepoImp implements SockRepo{
	Collection<SockDTO> sockDTOs = new ArrayList<>();

	public SockRepoImp(Collection<SockDTO> sockDTOs) {
		this.sockDTOs = sockDTOs;

	}

	public SockRepoImp() {
		System.out.println("no arg const.....");
	}
	@Override
	public boolean save(SockDTO sockDTO) {
		return sockDTOs.add(sockDTO);
	}

}
