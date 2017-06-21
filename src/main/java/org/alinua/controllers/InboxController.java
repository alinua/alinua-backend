/**
 * 
 */
package org.alinua.controllers;

import java.util.List;

import org.alinua.beans.Inbox;
import org.alinua.service.InboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yannick ADECHI
 *
 */
@RestController
public class InboxController {

	@Autowired
	private InboxService inService;
	/**
	 * 
	 * @return list of all inboxes in json format
	 */
	@RequestMapping( value = "/inbox", method = RequestMethod.GET)
	public List<Inbox> getAllInboxes() {
		System.out.println("**************Get all the inboxes************");
		List<Inbox> inboxes = inService.getAllInboxes();
		return inboxes;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping( value = "/inbox/user/{userId}", method = RequestMethod.GET)
	public List<Inbox> getAllInboxesByUser(@PathVariable("userId") Integer id) {
		
		return null;
	}
}
