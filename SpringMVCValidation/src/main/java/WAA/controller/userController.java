package WAA.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	//with at valid Spring will check bean validation for submitted data
	public String saveUser(@Valid @ModelAttribute("newUser") User user,BindingResult result,RedirectAttributes redirectAttrs) {
		
		//BindingResult is Spring's object that holds the result of the validation and binding and contains errors that may have occurred. 
		//The BindingResult must come right after the model object that is validated or else Spring will fail 
		//to validate the object and throw an exception
		
		//So BindingResult must be immediately after ModelAttribute
		if(result.hasErrors()) {
			//to show error and be editted
			return "userForm";
		}
		
		
		//save to DB
		
		//when we redirect data of user is no longer available:
		
		redirectAttrs.addFlashAttribute("savedUser",user);
		//redirect to another url
		// /user should remain here in redirect => we need to redirect to /user/userDetails
		return "redirect:/userDetails";
	}

	@RequestMapping(value="/userDetails")
	public String success() {
		//access to data in form through "savedUser" flush attr
		return "success";
	}
}
