package com.xwrkz.optional.runner;

import java.util.Optional;

import com.xwrkz.optional.cons.Type;
import com.xwrkz.optional.dto.SnakeDTO;
import com.xwrkz.optional.repo.SnakeRepo;
import com.xwrkz.optional.repo.SnakeRepoImp;
import com.xwrkz.optional.ser.SnakeSerImp;
import com.xwrkz.optional.ser.SnakeServ;

public class SnakeRunner {

	public static void main(String[] args) {

		SnakeDTO snakeDTO = new SnakeDTO(01, "cobra", "karnataka", Type.Poisonous);
		SnakeDTO snakeDTO2 = new SnakeDTO(02, "tiger snake", "goa", Type.Poisonous);
		SnakeDTO snakeDTO3 = new SnakeDTO(03, "anaconda", "hydrabad", Type.nonPoisonous);
		SnakeDTO snakeDTO4 = new SnakeDTO(04, "corn snake", "kerala", Type.nonPoisonous);
		SnakeDTO snakeDTO5 = new SnakeDTO(05, "carpet python", "tamil nadu", Type.nonPoisonous);

		SnakeRepo snake = new SnakeRepoImp();
		SnakeServ service = new SnakeSerImp(snake);
		boolean save = service.validateandsave(snakeDTO);
		System.out.println("save:" + save);
		boolean save1 = service.validateandsave(snakeDTO2);
		System.out.println("save:" + save1);
		boolean save2 = service.validateandsave(snakeDTO3);
		System.out.println("save:" + save2);
		boolean save3 = service.validateandsave(snakeDTO4);
		System.out.println("save:" + save3);
		boolean save4 = service.validateandsave(snakeDTO5);
		System.out.println("save:" + save4);
		Optional<SnakeDTO> option = service.findbyid(1);
		if (option.isPresent()) {
			System.out.println("snake is presnt");
			SnakeDTO prs = option.get();
			System.out.println(prs);
		} else {
			System.out.println("snake doesnot exist");
		}
		Optional<SnakeDTO> option1 = service.findbyname("anaconda");
		if (option1.isPresent()) {
			System.out.println("snake is presnt");
			SnakeDTO prs = option1.get();
			System.out.println(prs);
		} else {
			System.out.println("snake doesnot exist");
		}
		Optional<SnakeDTO> option2 = service.findbynameandplace("cobra", "karnataka");
		if (option2.isPresent()) {
			System.out.println("snake is presnt");
			SnakeDTO prs = option2.get();
			System.out.println(prs);
		} else {
			System.out.println("snake doesnot exist");
		}
		Optional<SnakeDTO> option3 = service.findbytype(Type.nonPoisonous);
		if (option3.isPresent()) {
			System.out.println("snake is presnt");
			SnakeDTO prs = option3.get();
			System.out.println(prs);
		} else {
			System.out.println("snake doesnot exist");
		}

	}

}
