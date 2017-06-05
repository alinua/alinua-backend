/**
 * 
 */
package org.alinua.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.alinua.beans.Job;
import org.alinua.dao.JobDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Implementation of the DAO(Data Access Object) interface {@link org.alinua.dao.JobDAO}
 * For CRUD(Create Read Update Delete) operations on job entity.
 * 
 * @author Yannick ADECHI
 *
 */
@Repository("JobDAO")
public class JobDAOImpl implements JobDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	/** 
	 * Save a job in the database
	 * @param job
	 * @see org.alinua.dao.JobDAO#saveJob(org.alinua.beans.Job)
	 */
	@Override
	public void saveJob(Job job) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(job);
	}

	
	/** 
	 * Update a job in the database
	 * @param job
	 * @see org.alinua.dao.JobDAO#updateJob(org.alinua.beans.Job)
	 */
	@Override
	public void updateJob(Job job) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(job);
	}

	
	/** 
	 * Delete a job in the database
	 * @param job
	 * @see org.alinua.dao.JobDAO#deleteJob(org.alinua.beans.Job)
	 */
	@Override
	public void deleteJob(Job job) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(job);
	}

	
	/**
	 * Find a job in the database using his id
	 * @param id
	 * @return job | null
	 * @see org.alinua.dao.JobDAO#findJob(java.lang.Integer)
	 */
	@Override
	public Job findJob(Integer id) {
		// TODO Auto-generated method stub
		Job job = new Job();
		job = sessionFactory.getCurrentSession().get(Job.class, id);
		return job;
	}

	/** 
	 * Return all the jobs informations stored in the database
	 * @return jobs | null
	 * @see org.alinua.dao.JobDAO#getAllJobs()
	 */
	@Override
	public List<Job> getAllJobs() {
		
		// Get Criteria Builder
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		
		// Create Criteria Query
		CriteriaQuery<Job> criteria = builder.createQuery(Job.class);
		
		// Specify criteria root
		criteria.from(Job.class);
		
		// Execute the query
		List<Job> jobs = sessionFactory.getCurrentSession().createQuery(criteria).getResultList();
		
		return jobs;
	}

}
