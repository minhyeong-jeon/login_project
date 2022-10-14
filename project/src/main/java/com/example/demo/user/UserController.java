package com.example.demo.user;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String join(@ModelAttribute("loginForm") User user) throws Exception {
		return "loginForm";
	}

	@PostMapping("/login")
	public String doJoin(@ModelAttribute("loginForm") User user, HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("userInfo", userService.searchUser(user));

		if(model.getAttribute("userInfo") == null) {
			model.addAttribute("message", "정보가 없습니다");
			return "loginForm";
		}
		else {
			return "home";
		}

	}
}
