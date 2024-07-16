package com.project.loginAndRegistration.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.loginAndRegistration.model.User;
import com.project.loginAndRegistration.model.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

