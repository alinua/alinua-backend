/**
 * 
 */
package org.alinua.dao;

import java.util.List;

import org.alinua.beans.Job;

/**
 * DAO(Data Access Object) interface handling "JOBS" table CRUD operations
 * 
 * @author Yannick ADECHI
 *
 */
public interface JobDAO {

	/**
	 * Save a job in the database
	 * 
	 * @param job
	 */
	void saveJob(Job job);
	
	
	/**
	 * Update a job in the database
	 * 
	 * @param job
	 */
	void updateJob(Job job);
	
	
	/**
	 * Delete a job in the database
	 * 
	 * @param job
	 */
	void deleteJob(Job job);
	

	/**
	 * Find a job in the database using his id
	 * 
	 * @param id
	 * @return job
	 */
	Job findJob(Integer id);
	
	
	/**
	 * Return all the jobs stored in the database
	 * @return jobs
	 */
	List<Job> getAllJobs();
}
