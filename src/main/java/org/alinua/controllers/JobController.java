/**
 * 
 */
package org.alinua.controllers;

import java.sql.Timestamp;
import java.util.List;

import org.alinua.beans.Job;
import org.alinua.beans.User;
import org.alinua.service.JobService;
import org.alinua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that handles jobs operations
 * 
 * @author Yannick ADECHI
 *
 */
@RestController
public class JobController {

	@Autowired
	private JobService jobService;
	@Autowired
	private UserService userService;
	
	/**
	 * Get all the jobs
	 * @return ResponseEntity
	 */
	@RequestMapping( value = "/jobs", method = RequestMethod.GET)
	public List<Job> getAllJobs() {
		System.out.println("********Get all the jobs***************");
		List<Job> jobs = jobService.getAllJobs();
		return jobs;
	}
	
	/**
	 * Get a job by his id
	 * @param id
	 * @return ResponseEntity
	 */
	@RequestMapping( value = "/jobs/job/{jobId}", method = RequestMethod.GET)
	public Job getJob(@PathVariable("jobId") Integer id) {
		System.out.println("********Get a specific job with id: *" + id + "******");
		Job job = jobService.findJob(id);
		if (job == null){
			System.out.print("Job not found.");
			return null;
		}
		return job;
	}
	
	
}
