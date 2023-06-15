package com.xworkz.integrate.service;

import com.xworkz.integrate.dto.AccountDTO;

public interface AccountService {
	boolean validateAndSave(AccountDTO dto);

}
