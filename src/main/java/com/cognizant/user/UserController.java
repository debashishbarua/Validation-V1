package com.cognizant.user;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.user.validators.UserValidator;

@Controller
public class UserController {

	@Autowired
	private UserValidator userValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(userValidator);
	}

	@GetMapping("/")
	public String userForm(Locale locale, Model model) {
		model.addAttribute("user", new User());
		return "userForm";
	}

	/*
	 * Save user object
	 */
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") @Validated User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "userForm";//Redirecting to input page
		}
		return "success";
	}
}






