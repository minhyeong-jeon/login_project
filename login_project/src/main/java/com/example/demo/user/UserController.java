package com.example.demo.user;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "login/loginForm";
	}
	
	@PostMapping("/login_exe")
	public String doLogin(@RequestParam(value="userId", defaultValue="--") String strUserId,
						@RequestParam(value="userPass", defaultValue="--") String strUserPW,
						Model model) throws Exception {
		User user = userService.doUserLogin(strUserId);
				

		String strReturn="";
		String strMeg="";

		if(user==null) {
			strReturn = "/login/loginForm";
			strMeg = "아이디와 패스워드를 입력해주세요";
		}
		
		else {
			if(!strUserId.equals(user.getUserId())) {
				strReturn = "/login/loginForm";
				strMeg = "아이디가 일치하지 않습니다.";
			}
			else if(!strUserPW.equals(user.getUserPass())) {
				strReturn = "/login/loginForm";
				strMeg = "패스워드가 일치하지 않습니다.";
			}
			else {
				strReturn = "redirect:/";
				strMeg = "로그인 성공.";
			}
		}
		
		model.addAttribute("message", strMeg);

		return strReturn;
	}
	



}
