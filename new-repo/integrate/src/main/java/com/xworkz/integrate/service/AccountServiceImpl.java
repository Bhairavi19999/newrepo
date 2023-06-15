package com.xworkz.integrate.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.integrate.dto.AccountDTO;
import com.xworkz.integrate.entity.AccountEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

	public AccountServiceImpl() {
		log.info("created" + getClass().getSimpleName());
	}
	@Override
	public boolean validateAndSave(AccountDTO dto) {
		AccountEntity Entity = new AccountEntity();
		BeanUtils.copyProperties(dto, Entity);
		log.info("DTO:" + dto);
		log.info("entity:" + Entity);
		return false;
	}

}
