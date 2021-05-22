package com.mjava.foodbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.foodbox.model.Register;

import com.mjava.foodbox.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository userrepo;

	public Register findLoginUserService(String username, String password, int rollid) {
		Register registerUser = null;
		registerUser = userrepo.isAdminOrNot(username, password, rollid);
		if (registerUser != null && registerUser.getFirstName().equals(username)
				&& registerUser.getPassword().equals(password) && registerUser.getRollid() != 0)
			return registerUser;
		else
			return registerUser;
	}
	
	public int changePasswordService(String newpassword,String currentpassword)
	{
		int count=0;
		  count=userrepo.changeUserPasswordRepo(newpassword, currentpassword);
		return count;
	}
}
