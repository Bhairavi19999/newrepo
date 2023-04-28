package com.xwrkz.optional.ser;

import java.util.Optional;

import com.xwrkz.optional.cons.Type;
import com.xwrkz.optional.dto.SnakeDTO;

public interface SnakeServ {
	boolean validateandsave(SnakeDTO dto);
	Optional<SnakeDTO> findbyid(int id);
	Optional<SnakeDTO> findbyname(String name);
	Optional<SnakeDTO> findbynameandplace(String name,String place);
	Optional<SnakeDTO> findbytype(Type type);


	

}
