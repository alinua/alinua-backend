/**
 * 
 */
package org.alinua.service;

import java.util.List;

import org.alinua.beans.Job;

/**
 * Service layer that uses JobDAO classes
 * 
 * @author Yannick ADECHI
 *
 */
public interface JobService {
	
	/**
	 * 
	 * @param job
	 */
	void saveJob(Job job);
	
	
	/**
	 * 
	 * @param job
	 */
	void updateJob(Job job);
	
	
	/**
	 * 
	 * @param job
	 */
	void deleteJob(Job job);
	
	
	/**
	 * 
	 * @param id
	 * @return job
	 */
	Job findJob(Integer id);
	
	
	/**
	 * 
	 * @return jobs
	 */
	List<Job> getAllJobs();
}
