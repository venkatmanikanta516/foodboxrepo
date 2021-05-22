package com.mjava.foodbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.foodbox.model.Register;
import com.mjava.foodbox.model.User;
import com.mjava.foodbox.repository.RegisterRepository;
import com.mjava.foodbox.repository.UserRepository;

@Service
public class RegisterService {
	@Autowired
	public RegisterRepository registerrepo;
	
	public void newUserRegister(Register register)
	{
		registerrepo.save(register);
	}
}
