/**
 * 
 */
package org.alinua.controllers;

import java.util.List;

import org.alinua.beans.User;
import org.alinua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller that handles users operations.
 *
 * @author Yannick ADECHI
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	   
	@RequestMapping("")
	public List<User> getAllUsers() {
		List<User> users = service.getAllUsers();	
		return users;
	}
	
	
	@RequestMapping("")
	public User getUser(@PathVariable("userId") Integer id){
		User user = new User();
		user = service.findUser(id);
		return user;
	}
}
