/**
 * 
 */
package org.alinua.dao;

import java.util.List;

import org.alinua.beans.Inbox;
import org.alinua.beans.Project;
import org.alinua.beans.User;

/**
 * DAO(Data Access Object) interface handling "PROJECTS" table
 * 
 * @author Yannick ADECHI
 *
 */
public interface ProjectDAO {

	/**
	 * Save an project in the database
	 * 
	 * @param project
	 */
	void saveProject(Project project);
	
	
	/**
	 * Update project informations in the database
	 * 
	 * @param project
	 */
	void updateProject(Project project);
	
	
	/**
	 * Delete an project in the database
	 * 
	 * @param project
	 */
	void deleteProject(Project project);
	

	/**
	 * Find an project in the database using his id
	 * 
	 * @param id
	 * @return project
	 */
	Project findProject(Integer id);
	
	
	/**
	 * Retrieve all the projects stored in the database
	 * 
	 * @return List<Project>
	 */
	List<Project> getAllProjects();
}
