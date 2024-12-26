package com.in.javaworkspace.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {

		boolean isValidUserName = username.equalsIgnoreCase("Rachit_Sharma");
		boolean isValidPassword = password.equalsIgnoreCase("devil");

		return isValidUserName && isValidPassword;

	}
}
