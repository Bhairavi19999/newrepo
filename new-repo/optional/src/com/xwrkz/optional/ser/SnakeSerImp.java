package com.xwrkz.optional.ser;

import java.util.Optional;

import com.xwrkz.optional.cons.Type;
import com.xwrkz.optional.dto.SnakeDTO;
import com.xwrkz.optional.repo.SnakeRepo;

public class SnakeSerImp implements SnakeServ {
	private SnakeRepo repo;

	public SnakeSerImp(SnakeRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateandsave(SnakeDTO dto) {
		if (dto != null) {
			return repo.save(dto);
		}
		return false;
	}

	@Override
	public Optional<SnakeDTO> findbyid(int id) {

		return this.repo.findbyid(id);
	}

	@Override
	public Optional<SnakeDTO> findbyname(String name) {
		return this.repo.findbyname(name);
	}

	@Override
	public Optional<SnakeDTO> findbynameandplace(String name, String place) {
		return this.repo.findbynameandplace(name, place);
	}

	

	@Override
	public Optional<SnakeDTO> findbytype( Type type) {
		return this.repo.findbytype(type);
	}

}
