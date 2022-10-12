package com.example.demo.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.user.User;

@Controller
@RequestMapping("/join")
public class JoinController {

	@Autowired
	JoinService joinService;
	
	@GetMapping("/join")
	public String login() {
		return "join/joinForm";
	}
	
	@PostMapping("/join_exe")
	public String doJoin(User user) {
		joinService.joinUser(user);
		return "redirect:/";
	}
	
}
