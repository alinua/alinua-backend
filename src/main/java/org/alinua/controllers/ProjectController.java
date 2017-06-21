/**
 * 
 */
package org.alinua.controllers;

import java.util.List;

import org.alinua.beans.Inbox;
import org.alinua.beans.Project;
import org.alinua.service.ProjectService;
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
public class ProjectController {

	
	@Autowired
	private ProjectService service;
	
	/**
	 * 
	 * @return list of all inboxes in json format
	 */
	@RequestMapping( value = "/projects", method = RequestMethod.GET)
	public List<Project> getAllprojects() {
		System.out.println("*******Get all the projects*******");
		List<Project> projects = service.getAllProjects();
		return projects;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping( value = "/projects/project/{projId}", method = RequestMethod.GET)
	public Project findAProject(@PathVariable("projId") Integer id) {
		System.out.println("*******Get project #"+ id +"***********");
		Project project = new Project();
		project = service.findProject(id);
		return project;
	}
}
