package com.project.loginAndRegistration.service;

import com.project.loginAndRegistration.model.User;
import com.project.loginAndRegistration.model.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
