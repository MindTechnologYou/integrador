package com.example.integrator.tienditaid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.integrator.tienditaid.model.User;
import com.example.integrator.tienditaid.service.AuthenticatorService;

@Controller
public class AuthenticatorController {

	@Autowired
	private AuthenticatorService authenticatorService;

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("/validateLogin")
	public String validateLogin(@ModelAttribute User user, Model model) {

		boolean result = authenticatorService.authenticateUser(user);

		if (result) {
			return "dashboard";
		} else {
			return "pagina de error";
		}

	}

	@GetMapping("/signUp")
	public String signUp(Model model) {
		model.addAttribute("user", new User());
		return "signUp";
	}

	@PostMapping("/createUser")
	public String createUser(@ModelAttribute User user, Model model) {

		// User user =authenticatorService.authenticateUser(user);

		model.addAttribute("user", user);
		return "dashord";
	}
}
