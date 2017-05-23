/**
 * 
 */
package org.alinua.controllers;

import java.sql.Timestamp;
import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;

import org.alinua.beans.User;
import org.alinua.configurations.AppConfig;
import org.alinua.dao.UserDAO;
import org.alinua.service.UserService;
import org.alinua.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.*;

/**
 * @author Yannick ADECHI
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

	
	
	@RequestMapping
	public ModelAndView getIndex() {
		
		ModelAndView model = new ModelAndView("index");
		return model;
	}
}
