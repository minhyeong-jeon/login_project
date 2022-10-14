package com.example.demo.join;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.user.User;

@Controller
@RequestMapping("/join")
public class JoinController {

	@Autowired
	JoinService joinService;
	
	@GetMapping("/join")
	public String join(@ModelAttribute("userForm") User user) throws Exception {
		return "joinForm";
	}

	@PostMapping("/join")
	public String doJoin(@ModelAttribute("userForm") User user, HttpServletRequest request) throws Exception {
		joinService.saveUser(user);

		return "redirect:/home";
	}
	

}
