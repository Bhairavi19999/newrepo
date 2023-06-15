package com.xworkz.integrate.repos;

import org.springframework.stereotype.Repository;

import com.xworkz.integrate.entity.AccountEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class AccountRepoImpl implements AccountRepo {

	public AccountRepoImpl() {
		log.info("runing save in AccountRepoImpl");
	}

	@Override
	public boolean save(AccountEntity accountEntity) {
		log.info("save method" + accountEntity);
		return false;
	}

}
