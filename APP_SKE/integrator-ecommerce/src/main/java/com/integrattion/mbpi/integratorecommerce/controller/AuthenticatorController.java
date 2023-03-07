package com.integrattion.mbpi.integratorecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.integrattion.mbpi.integratorecommerce.model.Dashboard;
import com.integrattion.mbpi.integratorecommerce.model.User;
import com.integrattion.mbpi.integratorecommerce.service.AuthenticatorService;

@Controller
public class AuthenticatorController {

    @Autowired
    private AuthenticatorService authenticatorService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "signIn";
    }

    @PostMapping("/validateLogin")
    public String validateLogin(@ModelAttribute User user, Model model) {

        boolean result = authenticatorService.authenticateUser(user);

        if (result) {
            return "dashboard";
        } else {
            return "signUp";
        }
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

        model.addAttribute("dashboard", new Dashboard());
        return "dashboard";
    }
}
