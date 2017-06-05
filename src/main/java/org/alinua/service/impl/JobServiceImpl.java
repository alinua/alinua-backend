/**
 * 
 */
package org.alinua.service.impl;

import java.util.List;

import org.alinua.beans.Job;
import org.alinua.dao.JobDAO;
import org.alinua.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * When a class is annotated by @Transactionnal 
 * Spring will inject transaction support code into the methods
 * 
 * @author Yannick ADECHI
 *
 */
@Service("JobService")
@Transactional
public class JobServiceImpl implements JobService {

	@Autowired 
	private JobDAO dao;
	
	
	/* (non-Javadoc)
	 * @see org.alinua.service.JobService#saveJob(org.alinua.beans.Job)
	 */
	@Override
	public void saveJob(Job job) {
		// TODO Auto-generated method stub
		dao.saveJob(job);
	}

	
	/* (non-Javadoc)
	 * @see org.alinua.service.JobService#updateJob(org.alinua.beans.Job)
	 */
	@Override
	public void updateJob(Job job) {
		// TODO Auto-generated method stub
		dao.updateJob(job);
	}

	
	/* (non-Javadoc)
	 * @see org.alinua.service.JobService#deleteJob(org.alinua.beans.Job)
	 */
	@Override
	public void deleteJob(Job job) {
		// TODO Auto-generated method stub
		dao.deleteJob(job);
	}

	
	/* (non-Javadoc)
	 * @see org.alinua.service.JobService#findJob(java.lang.Integer)
	 */
	@Override
	public Job findJob(Integer id) {
		// TODO Auto-generated method stub
		return dao.findJob(id);
	}

	
	/* (non-Javadoc)
	 * @see org.alinua.service.JobService#getAllJobs()
	 */
	@Transactional(readOnly = true)
	@Override
	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		return dao.getAllJobs();
	}

}
