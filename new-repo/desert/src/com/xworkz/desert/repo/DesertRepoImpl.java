package com.xworkz.desert.repo;

import com.xworkz.desert.dto.DesertDTO;

public class DesertRepoImpl implements DesertRepo {
	private DesertDTO[] desertDTOs = new DesertDTO[23];
	private int desertindex = 0;

	@Override
	public boolean save(DesertDTO desertDTO) {
		if (desertindex < desertDTOs.length) {
			this.desertDTOs[desertindex] = desertDTO;
			System.out.println("dto is saved at index :" + desertindex + " " + desertDTO);
			this.desertindex++;
			return true;
		} else {
			System.err.println("memory is full");
		}
		return false;
	}

	@Override
	public DesertDTO find(DesertDTO dto) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO element = this.desertDTOs[index];
			if (element.equals(dto)) {
				System.out.println("dto is find");
			}
		}

		return null;

	}

	@Override
	public DesertDTO findByName(String name) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO element = this.desertDTOs[index];
			if (element.getName().equals(name)) {
				System.out.println("name is presnt:" + name);
			}
		}
		return null;
	}

	@Override
	public DesertDTO findAreaByName(String name) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO element = this.desertDTOs[index];
			if (element.getArea().equals(name)) {
				System.out.println("area is presnt:" + name);
			}
		}
		return null;
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, String area) {
		for (int index = 0; index < this.desertDTOs.length; index++) {
			DesertDTO element = this.desertDTOs[index];
			if (element.getName().equals(name) && element.getCountry().equals(country)
					&& element.getArea().equals(area)) {
				System.out.println("name is presnt:" + name + " " + "country is present:" + country + "  "
						+ "area is presnt :" + area);
			}
		}
		return null;
	}

	@Override
	public int total() {
		return 0;
	}
}
