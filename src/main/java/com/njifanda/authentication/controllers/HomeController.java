package com.njifanda.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.njifanda.authentication.models.LoginUser;
import com.njifanda.authentication.models.User;
import com.njifanda.authentication.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;

	@GetMapping("")
	public String index(Model model) {

		model.addAttribute("login", new LoginUser());
		model.addAttribute("register", new User());
		return "index.jsp";
	}
	
    @PostMapping("/register")
    public String register(
    		@Valid @ModelAttribute("register") User user, 
            BindingResult result, 
            Model model,
            HttpSession session
    ) {

        if(result.hasErrors()) {

            model.addAttribute("login", new LoginUser());
            return "index.jsp";
        }
        
        User create = this.userService.register(user, result);
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(
    		@Valid @ModelAttribute("login") LoginUser user, 
            BindingResult result,
            Model model,
            HttpSession session
    ) {
        
        // Add once service is implemented:
        // User user = userServ.login(newLogin, result);
    
        if(result.hasErrors()) {

            model.addAttribute("register", new User());
            return "index.jsp";
        }
    
        // No errors! 
        // TO-DO Later: Store their ID from the DB in session, 
        // in other words, log them in.
    
        User login = this.userService.login(user, result);
        return "redirect:/home";
    }
}
