/**
 * 
 */
package org.alinua.service;

import java.util.List;

import org.alinua.beans.Project;
import org.alinua.beans.User;

/**
 * Service layer that uses ProjectDAO classes
 * 
 * @author Yannick ADECHI
 *
 */
public interface ProjectService {

	/**
	 * 
	 * @param project
	 */
	void saveProject(Project project);
	
	
	/**
	 * 
	 * @param project
	 */
	void updateProject(Project project);
	
	
	/**
	 * 
	 * 
	 * @param project
	 */
	void deleteProject(Project project);
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Project findProject(Integer id);
	
	
	/**
	 * 
	 * @return
	 */
	List<Project> getAllProjects();
}
