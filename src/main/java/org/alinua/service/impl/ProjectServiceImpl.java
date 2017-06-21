/**
 * 
 */
package org.alinua.service.impl;

import java.util.List;

import org.alinua.beans.Project;
import org.alinua.dao.ProjectDAO;
import org.alinua.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yannick ADECHI
 *
 */
@Transactional
@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService {

	
	@Autowired
	private ProjectDAO dao;
	/* (non-Javadoc)
	 * @see org.alinua.service.ProjectService#saveProject(org.alinua.beans.Project)
	 */
	@Override
	public void saveProject(Project project) {
		// TODO Auto-generated method stub
		dao.saveProject(project);
	}

	/* (non-Javadoc)
	 * @see org.alinua.service.ProjectService#updateProject(org.alinua.beans.Project)
	 */
	@Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		dao.updateProject(project);
	}

	/* (non-Javadoc)
	 * @see org.alinua.service.ProjectService#deleteProject(org.alinua.beans.Project)
	 */
	@Override
	public void deleteProject(Project project) {
		// TODO Auto-generated method stub
		dao.deleteProject(project);
	}

	/* (non-Javadoc)
	 * @see org.alinua.service.ProjectService#findProject(java.lang.Integer)
	 */
	@Override
	public Project findProject(Integer id) {
		// TODO Auto-generated method stub
		return dao.findProject(id);
	}

	/* (non-Javadoc)
	 * @see org.alinua.service.ProjectService#getAllProjects()
	 */
	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return dao.getAllProjects();
	}

}
