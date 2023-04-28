package com.xwrkz.optional.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.xwrkz.optional.cons.Type;
import com.xwrkz.optional.dto.SnakeDTO;

public class SnakeRepoImp implements SnakeRepo {
	private Collection<SnakeDTO> snakeDTOs = new ArrayList<>();

	@Override
	public boolean save(SnakeDTO dto) {

		return this.snakeDTOs.add(dto);
	}

	@Override
	public Optional<SnakeDTO> findbyid(int id) {
		for (SnakeDTO dto : snakeDTOs) {
			if (dto.getId() == id) {
				return Optional.of(dto);
			}
		}
		return Optional.empty();
	}

	@Override
	public Optional<SnakeDTO> findbyname(String name) {
		for (SnakeDTO dto : snakeDTOs) {
			if (dto.getName().equals(name)) {
				return Optional.of(dto);
			}
		}
		return Optional.empty();

	}

	@Override
	public Optional<SnakeDTO> findbynameandplace(String name, String place) {
		for (SnakeDTO dto : snakeDTOs) {
			if (dto.getName().equals(name) && dto.getPlace().equals(place)) {
				return Optional.of(dto);
			}
		}
		return Optional.empty();
	}

	@Override
	public Optional<SnakeDTO> findbytype(Type type) {
		snakeDTOs.stream().filter(e -> e.getType().equals(type.nonPoisonous)).forEach(e -> System.out.println(e));
		return Optional.empty();
	}

}
