package com.icoding.trangphuc.dao;

import com.icoding.trangphuc.domain.Account;

public interface AccountDao extends AbstracFacadeDao<Account> {

	Account authenticationByRole(String username, String password, String roleName);
}
