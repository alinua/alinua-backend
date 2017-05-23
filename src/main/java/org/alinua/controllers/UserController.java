/**
 * 
 */
package org.alinua.controllers;

import java.util.List;

import org.alinua.beans.User;
import org.alinua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Yannick ADECHI
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public ModelAndView getAllUsers() {
		ModelAndView model = new ModelAndView("usersTest");
		List<User> users = service.getAllUsers();
		
		model.addObject("users", users);
		return model;
	}
	
	@GetMapping("/users/user/{userId}")
	public ModelAndView getUser(@PathVariable("userId") Integer id){
		ModelAndView model = new ModelAndView("usersTest");
		User user = new User();
		user = service.findUser(id);
		model.addObject("user", user);
		return model;
	}
}
