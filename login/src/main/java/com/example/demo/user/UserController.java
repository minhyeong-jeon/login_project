package com.example.demo.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/login")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String login() {
		return "/login/loginForm";
	}
	
	

	@PostMapping("/login_exe")
	public String login(@RequestParam(value="id", defaultValue="--") String Userid,
			@RequestParam(value="pw", defaultValue="--") String Userpw,
			@RequestParam(value="name", defaultValue="--") String Username,
			@RequestParam(value="date", defaultValue="--") String Userdate,
			Model model) throws Exception {
		User user = userService.login(Userid);
		

		String strReturn="";
		String msg="";
	
		if(user==null) {
			strReturn = "/login/loginForm";
			msg = "아이디와 패스워드를 입력해주세요";
		}
		
		else {
			if(!Userid.equals(user.getId())) {
				strReturn = "/login/loginForm";
				msg = "아이디가 일치하지 않습니다.";
			}
			else if(!Userpw.equals(user.getPw())) {
				strReturn = "/login/loginForm";
				msg = "패스워드가 일치하지 않습니다.";
			}
			
			else if(!Username.equals(user.getName())) {
				strReturn = "/login/loginForm";
				msg = "이름이 일치하지 않습니다.";
			}
			
			else if(!Userdate.equals(user.getDate())) {
				strReturn = "/login/loginForm";
				msg = "생년월일이 일치하지 않습니다.";
			}
			
			else {
				strReturn = "redirect:/";
				msg = "로그인 성공.";
			}
		}
		
		model.addAttribute("message", msg);
		
		return strReturn;
		}
	}
	/*
	 * try {
	 * 
	 * public String doLogin(@RequestParam(value="userName", defaultValue="--")
	 * String strUserName,
	 * 
	 * @RequestParam(value="userDate", defaultValue="--") String strUserDate,
	 * 
	 * @RequestParam(value="userId", defaultValue="--") String strUserId,
	 * 
	 * @RequestParam(value="userPass", defaultValue="--") String strUserPW, Model
	 * model) throws Exception
	 * 
	 * User user = userService.login(map);
	 * 
	 * if (map.get("id") == null || map.get("pw") == null || map.get("name") == null
	 * || map.get("date") == null) { model.addAttribute("msg", "정보를 입력해주세요"); return
	 * "error/error"; }
	 * 
	 * 
	 * if (user != null) { session.setAttribute("info", user);
	 * model.addAttribute("msg", "로그인성공");
	 * 
	 * } else { if(!(map.get("id")).equals(user.getId())) {
	 * model.addAttribute("msg", "아이디 또는 비밀번호가 올바르지 않습니다."); return "error/error"; }
	 * //model.addAttribute("msg", "아이디 또는 비밀번호가 올바르지 않습니다."); //return
	 * "error/error"; } } catch (Exception e) { e.printStackTrace();
	 * model.addAttribute("msg", "로그인 중 문제가 발생했습니다."); return "error/error"; }
	 * return "index"; } // end of PostMapping("login") }
	 */