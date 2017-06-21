/**
 * 
 */
package org.alinua.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.alinua.beans.Project;
import org.alinua.beans.User;
import org.alinua.dao.ProjectDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Implementation of the DAO(Data Access Object) interface {@link org.alinua.dao.ProjectDAO}
 * For CRUD(Create Read Update Delete) operations on project entity
 * 
 * @author Yannick ADECHI
 *
 */
@Repository("ProjectDAO")
public class ProjectDAOImpl implements ProjectDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	/* (non-Javadoc)
	 * @see org.alinua.dao.ProjectDAO#saveProject(org.alinua.beans.Project)
	 */
	@Override
	public void saveProject(Project project) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(project);
	}

	/* (non-Javadoc)
	 * @see org.alinua.dao.ProjectDAO#updateProject(org.alinua.beans.Project)
	 */
	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(project);
	}

	/* (non-Javadoc)
	 * @see org.alinua.dao.ProjectDAO#deleteProject(org.alinua.beans.Project)
	 */
	@Override
	public void deleteProject(Project project) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(project);
	}

	/* (non-Javadoc)
	 * @see org.alinua.dao.ProjectDAO#findProject(java.lang.Integer)
	 */
	@Override
	public Project findProject(Integer id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Project.class, id);
	}

	/* (non-Javadoc)
	 * @see org.alinua.dao.ProjectDAO#getAllProjects()
	 */
	@Override
	public List<Project> getAllProjects() {
		
		// Get Criteria Builder
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
			
		// Create Criteria Query
		CriteriaQuery<Project> criteria = builder.createQuery(Project.class);
				
		// Specify criteria root
		criteria.from(Project.class);
				
		// Execute the query
		List<Project> projects = sessionFactory.getCurrentSession().createQuery(criteria).getResultList();
				
		return projects;
	}

}
