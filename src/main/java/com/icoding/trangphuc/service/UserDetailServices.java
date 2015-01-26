package com.icoding.trangphuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.icoding.trangphuc.dao.AccountDao;
import com.icoding.trangphuc.domain.Account;

public class UserDetailServices implements UserDetailsService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		/*Account acc = accountDao.authenticationByRole(username, password,
				roleName);*/
		/*
		 * List<GrantedAuthority> authorities =
		 * buildUserAuthority(acc.getUserRole());
		 * 
		 * return buildUserForAuthentication(acc, authorities);
		 */
		return null;
	}

	private List<GrantedAuthority> buildUserAuthority() {
		/*
		 * return new User(user.getUsername(), user.getPassword(),
		 * user.isEnabled(), true, true, true, authorities);
		 */
		return null;
	}

	private User buildUserForAuthentication(Account account,
			List<GrantedAuthority> authorities) {
		/*
		 * Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		 * 
		 * // Build user's authorities for (UserRole userRole : userRoles) {
		 * setAuths.add(new SimpleGrantedAuthority(userRole.getRole())); }
		 * 
		 * List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(
		 * setAuths);
		 */
		return null;
	}

}
