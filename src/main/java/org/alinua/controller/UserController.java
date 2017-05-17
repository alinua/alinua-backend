/**
 * 
 */
package org.alinua.controller;

import java.util.List;

import org.alinua.beans.User;
import org.alinua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yannick ADECHI
 *
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = userService.getAllUsers();
		
		return null;
	}
	
	/*@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
		
		return null;
	}*/
}
