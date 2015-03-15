package com.icoding.trangphuc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.icoding.trangphuc.domain.Account;

@Repository
public class AccountDaoImpl<T extends Account> extends
		AbstractFacadeDaoImpl<Account> implements AccountDao {

	@Override
	public Account authenticationByRole(String username) {
		Account acc = null;
		try {
			@SuppressWarnings("unchecked")
			List<Account> listAccounts = getCurrentSession()
					.createQuery(" from Account where username = :username ")
					.setParameter("username", username).list();
			if (listAccounts.size() > 0) {
				acc = listAccounts.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return acc;
	}
}
