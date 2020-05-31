package WAA.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import WAA.domain.User;

@Controller
public class userController {
	@RequestMapping(value= {"/","/user/add"} ,method = RequestMethod.GET)
	//ModelAttr for 
	public String getUserForm(@ModelAttribute("newUser") User user,Model model) {
		//for select role
		Map<String,String> roleMap = new HashMap<String,String>();
		roleMap.put("Admin", "Admin");
		roleMap.put("DBA", "DBA");
		//wee need to add role to request scope
		//role is a field in User Domain
		model.addAttribute("roles",roleMap);
		return "userForm";
		
	}
	@RequestMapping(value="/user/add", method=RequestMethod.POST)
	public String saveUser(Model model) {
		//save to DB
		return "";
	}

}
