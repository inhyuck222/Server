package kr.co.shootthem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.shootthem.model.User;
import kr.co.shootthem.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String home(HttpServletRequest request, Model model) {
		
		String userId = request.getParameter("userId");
		System.out.println(userId);
		User user = userService.getUser(userId);
		if(user != null){
			System.out.println(user.getUserId());			
		}
		else{
			System.out.println("It is null");
		}
		
		model.addAttribute("user", user);
		
		return "user";
	}
	
}