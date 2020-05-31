package WAA.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import WAA.domain.User;

@Controller
@RequestMapping(value="/user")
public class userController {
	@RequestMapping(value= {"/add"} ,method = RequestMethod.GET)
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
	@RequestMapping(value="/add", method=RequestMethod.POST)
	//modelAttr is not required
	public String saveUser(@ModelAttribute("newUser") User user,RedirectAttributes redirectAttrs) {
		//save to DB
		
		//when we redirect data of user is no longer available:
		
		redirectAttrs.addFlashAttribute("savedUser",user);
		//redirect to another url
		return "redirect:/userDetails";
	}

	@RequestMapping(value="/userDetails")
	public String success() {
		//access to data in form through "savedUser" flush attr
		return "success";
	}
}
