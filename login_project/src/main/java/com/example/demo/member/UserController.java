package com.example.demo.member;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user/login")
	public String login() {
		return "user/login";
	}
	
	@PostMapping("/user/login")
	public String login(@RequestParam Map<String, String> map, Model model, HttpSession session) {
		
		try {
			if (map.get("userName") == null || map.get("userDate") == null || map.get("userId") == null || map.get("userPass") == null) {
				model.addAttribute("msg", "항목을 모두 입력해주세요");
				return "error/error";
			}
			
			User user = userService.login(map);
			
			if (user != null) {
				session.setAttribute("user", user);
			} else {
				model.addAttribute("msg", "정보가 올바르지 않습니다.");
				return "error/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "로그인 중 문제가 발생했습니다.");
			return "error/error";
		}
		System.out.println("ok");
		
		return "index";
	}

}
