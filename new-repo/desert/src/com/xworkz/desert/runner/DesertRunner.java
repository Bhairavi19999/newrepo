package com.xworkz.desert.runner;

import com.xworkz.desert.dto.DesertDTO;
import com.xworkz.desert.repo.DesertRepo;
import com.xworkz.desert.repo.DesertRepoImpl;
import com.xworkz.desert.service.DesertService;
import com.xworkz.desert.service.DesertServiceimpl;

public class DesertRunner {

	public static void main(String[] args) {
		DesertDTO desertDTO = new DesertDTO(1, "sahara desert", "north africa", "libya", 34, 45);
		DesertRepo repo = new DesertRepoImpl();
		DesertService service = new DesertServiceimpl(repo);
		boolean save = service.validAndSave(desertDTO);
		System.out.println("saved:" + save);
		System.out.println("    ");

		DesertDTO desertDTO1 = new DesertDTO(2, "atacama desert", "west of andes", "peru", 34, 45);
		boolean save1 = service.validAndSave(desertDTO1);
		System.out.println("saved:" + save1);
		System.out.println("    ");

		DesertDTO desertDTO2 = new DesertDTO(3, "gobi desert", "east asia", "china", 34, 45);
		boolean save2 = service.validAndSave(desertDTO2);
		System.out.println("saved:" + save2);
		System.out.println("    ");

		DesertDTO desertDTO3 = new DesertDTO(4, "kalahari desert", "south africa", "ladakh", 34, 45);
		boolean save3 = service.validAndSave(desertDTO3);
		System.out.println("saved:" + save3);
		System.out.println("    ");

		DesertDTO desertDTO4 = new DesertDTO(5, "arabian desert", "eurasia", "arabian", 34, 45);
		boolean save4 = service.validAndSave(desertDTO4);
		System.out.println("saved:" + save4);
		System.out.println("    ");

		DesertDTO desertDTO5 = new DesertDTO(6, "namib desert", "africa", "atlantic coast", 34, 45);
		boolean save5 = service.validAndSave(desertDTO5);
		System.out.println("saved:" + save5);
		System.out.println("    ");

		DesertDTO desertDTO6 = new DesertDTO(7, "mojave desert", "southwestern US", "southeastern califonia", 34, 45);
		boolean save6 = service.validAndSave(desertDTO6);
		System.out.println("saved:" + save6);
		System.out.println("    ");

		DesertDTO desertDTO7 = new DesertDTO(8, "sonoran desert", "arizona", "california", 34, 45);
		boolean save7 = service.validAndSave(desertDTO7);
		System.out.println("saved:" + save7);
		System.out.println("    ");

		DesertDTO desertDTO8 = new DesertDTO(9, "patagonian desert", "argentina", "south america", 34, 45);
		boolean save8 = service.validAndSave(desertDTO8);
		System.out.println("saved:" + save8);
		System.out.println("    ");

		DesertDTO desertDTO9 = new DesertDTO(10, "thar desert", "rajasthan", "rajastan", 34, 45);
		boolean save9 = service.validAndSave(desertDTO9);
		System.out.println("saved:" + save9);
		System.out.println("    ");

		DesertDTO desertDTO10 = new DesertDTO(11, "antartica", "antartica", "artic", 34, 45);
		boolean save10 = service.validAndSave(desertDTO10);
		System.out.println("saved:" + save10);
		System.out.println("    ");

		DesertDTO desertDTO11 = new DesertDTO(12, "chihuahuan desert", "north america", "america", 34, 45);
		boolean save11 = service.validAndSave(desertDTO11);
		System.out.println("saved:" + save11);
		System.out.println("    ");

		DesertDTO desertDTO12 = new DesertDTO(13, "taklamakan desert", "xinjiang uygur", "china", 34, 45);
		boolean save12 = service.validAndSave(desertDTO12);
		System.out.println("saved:" + save12);
		System.out.println("    ");

		DesertDTO desertDTO13 = new DesertDTO(14, "great victoria desert", "australia", "australia", 34, 45);
		boolean save13 = service.validAndSave(desertDTO13);
		System.out.println("saved:" + save13);
		System.out.println("    ");

		DesertDTO desertDTO14 = new DesertDTO(15, "syrian desert", "arabian", "syria", 34, 45);
		boolean save14 = service.validAndSave(desertDTO14);
		System.out.println("saved:" + save14);
		System.out.println("    ");

		DesertDTO desertDTO15 = new DesertDTO(16, "karakum desert", "central asia", "asia", 34, 45);
		boolean save15 = service.validAndSave(desertDTO15);
		System.out.println("saved:" + save15);
		System.out.println("    ");

		DesertDTO desertDTO16 = new DesertDTO(17, "great basin desert", "USA", "sierra nevada", 34, 45);
		boolean save16 = service.validAndSave(desertDTO16);
		System.out.println("saved:" + save16);
		System.out.println("    ");

		DesertDTO desertDTO17 = new DesertDTO(18, "polar desert", "northern polar region", "earth", 34, 45);
		boolean save17 = service.validAndSave(desertDTO17);
		System.out.println("saved:" + save17);
		System.out.println("    ");

		DesertDTO desertDTO18 = new DesertDTO(19, "empty quarter desert", "saudi", "oman", 34, 45);
		boolean save18 = service.validAndSave(desertDTO18);
		System.out.println("saved:" + save18);
		System.out.println("    ");

		DesertDTO desertDTO19 = new DesertDTO(20, "kyzylkum desert", "central asia", "asia", 34, 45);
		boolean save19 = service.validAndSave(desertDTO19);
		System.out.println("saved:" + save19);
		System.out.println("    ");

		DesertDTO desertDTO20 = new DesertDTO(21, "sandy desert", "australia", "australia", 34, 45);
		boolean save20 = service.validAndSave(desertDTO20);
		System.out.println("saved:" + save20);
		System.out.println("    ");

		DesertDTO desertDTO21 = new DesertDTO(22, "dasht-e lut", "afghanistan", "afghanistan", 34, 45);
		boolean save21 = service.validAndSave(desertDTO21);
		System.out.println("saved:" + save21);
		System.out.println("    ");

		DesertDTO desertDTO22 = new DesertDTO(23, "great basin desert", "USA", "sierra nevada", 34, 45);
		boolean save22 = service.validAndSave(desertDTO22);
		System.out.println("saved:" + save22);
		System.out.println("    ");

		DesertDTO desertDTO23 = new DesertDTO(24, "ghhgvh", "vjhvgf", "hgjgy", 34, 45);
		boolean save23 = service.validAndSave(desertDTO23);
		System.out.println("saved:" + save23);
		System.out.println("    ");

		System.out.println(service.find(desertDTO21));
		service.findAreaByName("sahara desert");
		service.findByName("north africa");
		service.findByNameAndCountryAndArea("sahara desert", "north africa", "libya");
		System.out.println("total saved is:"+service.total());

	}

}
