package com.xworkz.festival.runner;

import java.time.LocalDate;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.excep.InvalidFestivalException;
import com.xworkz.festival.repo.FestivalRepo;
import com.xworkz.festival.repo.FestivalRepoImp;
import com.xworkz.festival.service.FestivalService;
import com.xworkz.festival.service.FestivalServiceImp;

public class FestivalRunner {

	public static void main(String[] args) {
		try {
			FestivalDTO festivalDTO = new FestivalDTO(1, "ugadi", "jamaun", "shiva", LocalDate.of(2023, 10, 10),
					LocalDate.of(2024, 10, 10));
			FestivalRepo festivalRepo = new FestivalRepoImp();
			FestivalService festival = new FestivalServiceImp(festivalRepo);
			System.out.println("saved:" + festival.ValidateAndSave(festivalDTO));

			FestivalDTO festivalDTO1 = new FestivalDTO(1, "ugadi", "jamaun", "shiva", LocalDate.of(2023, 10, 10),
					LocalDate.of(2024, 10, 10));
			FestivalService festival1 = new FestivalServiceImp(festivalRepo);
			System.out.println("saved:" + festival1.ValidateAndSave(festivalDTO1));

			FestivalDTO festivalDTO2 = new FestivalDTO(1, "ugadi", "jamaun", "shiva", LocalDate.of(2023, 10, 10),
					LocalDate.of(2024, 10, 10));
			FestivalService festival2 = new FestivalServiceImp(festivalRepo);
			System.out.println("saved:" + festival2.ValidateAndSave(festivalDTO2));

			FestivalDTO festivalDTO3 = new FestivalDTO(1, "ugadi", "jamaun", "shiva", LocalDate.of(2023, 10, 10),
					LocalDate.of(2024, 10, 10));
			FestivalService festival3 = new FestivalServiceImp(festivalRepo);
			System.out.println("saved:" + festival3.ValidateAndSave(festivalDTO3));

			FestivalDTO festivalDTO4 = new FestivalDTO(1, "ugadi", "jamaun", "shiva", LocalDate.of(2023, 10, 10),
					LocalDate.of(2024, 10, 10));
			FestivalService festival4 = new FestivalServiceImp(festivalRepo);
			System.out.println("saved:" + festival4.ValidateAndSave(festivalDTO4));
		} catch (InvalidFestivalException e) {
			System.out.println("exception handled" + e);

		}
	}
}
