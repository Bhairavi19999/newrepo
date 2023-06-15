package com.xworkz.integrate.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.integrate.dto.AccountDTO;
import com.xworkz.integrate.entity.AccountEntity;
import com.xworkz.integrate.repos.AccountRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepo accountRepo;

	public AccountServiceImpl() {
		log.info("created" + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(AccountDTO dto) {
		AccountEntity Entity = new AccountEntity();
		BeanUtils.copyProperties(dto, Entity);
		log.info("DTO:" + dto);
		log.info("entity:" + Entity);
		boolean save = accountRepo.save(Entity);
		return save;
	}

}
