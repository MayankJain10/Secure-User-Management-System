package com.project.loginAndRegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.loginAndRegistration.model.User;
import com.project.loginAndRegistration.model.dto.UserRegistrationDto;
import com.project.loginAndRegistration.service.UserService;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto, Model model) {
		userService.save(registrationDto);
		 model.addAttribute("success", true);
		return "redirect:/registration?success";
	}
}
