package com.xworkz.dog.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dog.dto.PassportDTO;
import com.xworkz.dog.entity.PassEntity;
import com.xworkz.dog.repository.PassPortRepos;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PassServiceImp implements PassService {
	@Autowired
	private PassPortRepos passPortRepos;

	public PassServiceImp() {
		log.info("created" + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(PassportDTO dto) {
		PassEntity passEntity = new PassEntity();
		BeanUtils.copyProperties(dto, passEntity);
		log.info("DTO:" + dto);
		log.info("entity:" + passEntity);
		boolean save = passPortRepos.save(passEntity);
		return save;
	}

}
