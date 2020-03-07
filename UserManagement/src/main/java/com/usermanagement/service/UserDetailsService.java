package com.usermanagement.service;

import com.usermanagement.document.User;
import com.usermanagement.document.UserList;

public interface UserDetailsService {

	public User isLogin(User userBean);
	
	public UserList getAllUsers();
	
	public User register(User userBean);

	public User signOut(User userBean);
}
