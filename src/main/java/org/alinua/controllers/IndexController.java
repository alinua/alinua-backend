/**
 * 
 */
package org.alinua.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller that handles the welcome page
 *
 * @author Yannick ADECHI
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String getIndex() {
		
		return "index";
	}
}
