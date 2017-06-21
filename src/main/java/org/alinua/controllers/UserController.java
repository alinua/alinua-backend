/**
 * 
 */
package org.alinua.controllers;

import java.util.List;

import org.alinua.beans.User;
import org.alinua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that handles users operations
 * 
 * @author Yannick ADECHI
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	/**
	 * Send a list of all the users to http variable
	 * in json format
	 * 
	 * @return all the users
	 */
	@RequestMapping( value = "/users", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		System.out.println("************Get all the users************");
		List<User> users = userService.getAllUsers();	
		return users;
	}
	
	
	/**
	 * Send an user to http variable in json format 
	 * 
	 * @param id
	 * @return user
	 */
	@RequestMapping( value = "/users/user/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable("userId") Integer id){
		System.out.println("**************Find the user with id: "+ id +"************");
		User user = new User();
		user = userService.findUser(id);
		if (user == null) {
			System.out.println("User not found.");	
		}
		return user;
	}
}
