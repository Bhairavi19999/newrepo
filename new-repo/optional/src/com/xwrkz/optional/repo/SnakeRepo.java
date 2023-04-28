package com.xwrkz.optional.repo;

import java.util.Optional;

import com.xwrkz.optional.cons.Type;
import com.xwrkz.optional.dto.SnakeDTO;

public interface SnakeRepo {
	boolean save(SnakeDTO dto);

	Optional<SnakeDTO> findbyid(int id);
	Optional<SnakeDTO> findbyname(String name);
	Optional<SnakeDTO> findbynameandplace(String name,String place);
	Optional<SnakeDTO> findbytype(Type type);

	



}
