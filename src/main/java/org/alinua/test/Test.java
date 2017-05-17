package org.alinua.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.alinua.beans.User;
import org.alinua.configuration.AppConfig;
import org.alinua.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserService service = (UserService) context.getBean("userService");
		
		// Initialize Timestamp
		Timestamp timesta = new Timestamp(1494934274);
		
		// Create Users
		User user_1 = new User();
		User user_2 = new User();
		User user_3 = new User();
		
		// Set Attributes
		user_1.setUsername("Joel");
		user_1.setEmail("gggggggg@yyjj.fr");
		user_1.setLastConnection(timesta);
		
		user_2.setUsername("Yann");
		user_2.setEmail("yann@yahoo.fr");
		user_2.setLastConnection(timesta);
		
		user_3.setUsername("Franck");
		user_3.setEmail("fran@gma.com");
		user_3.setLastConnection(timesta);
		
		
		// Save users
		service.saveUser(user_1);
		service.saveUser(user_2);
		service.saveUser(user_3);

		// Get All The Users
		List<User> users = null;
		users = service.getAllUsers();
		
		// Print all users's informations
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());
		}
		
		// Close the context
		context.close();
	}

}
