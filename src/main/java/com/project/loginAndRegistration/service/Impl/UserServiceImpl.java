package com.project.loginAndRegistration.service.Impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.loginAndRegistration.model.Roles;
import com.project.loginAndRegistration.model.User;
import com.project.loginAndRegistration.model.dto.UserRegistrationDto;
import com.project.loginAndRegistration.repository.UserRepository;
import com.project.loginAndRegistration.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(),
				registrationDto.getPassword(), Arrays.asList(new Roles("ROLE_USER")));
		
		return userRepository.save(user);
	}

}
