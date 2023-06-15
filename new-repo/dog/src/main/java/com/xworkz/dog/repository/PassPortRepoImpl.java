package com.xworkz.dog.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.dog.entity.PassEntity;

import lombok.extern.slf4j.Slf4j;
@Repository
@Slf4j
public class PassPortRepoImpl implements PassPortRepos {

	@Override
	public boolean save(PassEntity entity) {
		log.info("running save PassPortRepoImpl"+entity);
		return false;
	}

}
