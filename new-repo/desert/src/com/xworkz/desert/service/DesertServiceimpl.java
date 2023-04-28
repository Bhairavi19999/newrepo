package com.xworkz.desert.service;

import com.xworkz.desert.dto.DesertDTO;

import com.xworkz.desert.repo.DesertRepo;
import com.xworkz.desert.util.DesertUtil;
import static com.xworkz.desert.util.DesertUtil.*;

public class DesertServiceimpl implements DesertService {
	private DesertRepo desertRepo;

	public DesertServiceimpl(DesertRepo desertRepo) {
		this.desertRepo = desertRepo;
	}

	@Override
	public boolean validAndSave(DesertDTO dto) {
		System.out.println("running ValidateAndSave in FestivalServiceImp" + dto);
		if (dto != null) {
			int id = dto.getId();
			String name = dto.getName();
			String country = dto.getCountry();
			String area = dto.getArea();
			double maxTemp = dto.getMaxTemp();
			double minTemp = dto.getMinTemp();
			boolean validid = false;
			boolean validname = false;
			boolean validcountry = false;
			boolean validarea = false;
			boolean validmaxTemp = false;
			boolean validminTemp = false;
			if (DesertUtil.validString(name)) {
				System.out.println("name is valid");
				validname = true;
			} else {
				System.err.println("name is invalid");
			}
			if (DesertUtil.validInt(id)) {
				System.out.println("id is valid");
				validid = true;
			} else {
				System.err.println("id is invalid");
			}
			if (DesertUtil.validString(country)) {
				System.out.println("country is valid");
				validcountry = true;
			} else {
				System.out.println("country is invalid");
			}
			if (DesertUtil.validString(area)) {
				System.out.println("area is valid");
				validarea = true;
			} else {
				System.out.println("area is invalid");
			}
			if (DesertUtil.validnumber(maxTemp)) {
				System.out.println("maxTemp is valid");
				validmaxTemp = true;
			} else {
				System.out.println("maxTemp is invalid");
			}
			if (DesertUtil.validnumber(minTemp)) {
				System.out.println("minTemp is valid");
				validminTemp = true;
			} else {
				System.out.println("minTemp is invalid");
			}
			if (DesertUtil.valiFlag(validid, validname, validcountry, validarea, validmaxTemp, validminTemp)) {
				System.out.println("data is valid and save successfully");
				boolean exist = this.desertRepo.isExist(dto);
				if (!exist) {
					boolean save = this.desertRepo.save(dto);
					return save;

				}
			} else {
				System.err.println("data is invalid");
			}
		} else {
			System.err.println("dto is null");
		}

		return false;
	}

	@Override
	public DesertDTO find(DesertDTO dto) {

		return desertRepo.find(dto);

	}

	@Override
	public DesertDTO findByName(String name) {
		if (validString(name)) {
			return this.desertRepo.findByName(name);
		}
		return null;

	}

	@Override
	public DesertDTO findAreaByName(String name) {
		if (validString(name)) {
			return this.desertRepo.findAreaByName(name);
		}
		return null;
	}

	@Override
	public DesertDTO findByNameAndCountryAndArea(String name, String country, String area) {
		if (validString(name) && validString(country) && validString(area)) {
			return this.desertRepo.findByNameAndCountryAndArea(name, country, area);
		}
		return null;
	}

	@Override
	public int total() {
		return this.desertRepo.total();
	}
}
