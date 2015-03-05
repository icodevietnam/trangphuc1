package com.icoding.trangphuc.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icoding.trangphuc.dao.AccountDao;
import com.icoding.trangphuc.domain.Account;
import com.icoding.trangphuc.domain.Role;
import com.icoding.trangphuc.utils.Encryption;

@Service
public class LoginService implements UserDetailsService {

	@Autowired
	private AccountDao accountDao;

	/*
	 * Check by username
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */

	@Transactional
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = null;
		try {
			Account account = accountDao.authenticationByRole(username);
			List<GrantedAuthority> authorities = buildUserAuthority(account
					.getListRoles());
			user = buildUserForAuthentication(account, authorities);
		} catch (UsernameNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	/**
	 * Get List of roles in this website
	 * 
	 * @param roles
	 * @return
	 */
	private List<GrantedAuthority> buildUserAuthority(Collection<Role> roles) {
		List<Role> listRoles = new ArrayList<Role>(roles);
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		for (Role role : listRoles) {
			setAuths.add(new SimpleGrantedAuthority(role.getName()));
		}
		List<GrantedAuthority> listGrantedAuthorities = new ArrayList<GrantedAuthority>(
				setAuths);
		return listGrantedAuthorities;
	}

	/**
	 * Build user ready for authentication.
	 * 
	 * @param account
	 * @param authorities
	 * @return
	 */
	private User buildUserForAuthentication(Account account,
			List<GrantedAuthority> authorities) {
		return new User(account.getUsername(), Encryption.md5(account
				.getPassword()), authorities);
	}

}
