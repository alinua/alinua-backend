/**
 * 
 */
package org.alinua.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.alinua.beans.User;
import org.alinua.dao.AbstractDAO;
import org.alinua.dao.UserDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Yannick ADECHI
 *
 */
@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	/**
	 * Save user's informations in the database
	 * @param User
	 * @see org.alinua.dao.UserDAO#saveUser(User)
	 */
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(user);
	}

	
	/**
	 * Update user's informations in the database
	 * @param User
	 * @see org.alinua.dao.UserDAO#updateUser(User)
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * Delete an user in the database using his id
	 * @param Integer
	 * @see org.alinua.dao.UserDAO#deleteUser(Integer)
	 */
	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * Find an user in the database using his id
	 * @param Integer
	 * @return User
	 * @see org.alinua.dao.UserDAO#findUser(Integer)
	 */
	@Override
	public User findUser(Integer id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(User.class, id);
	}
	
	
	/** 
	 * Return all users informations strored in the database
	 * @return List<User>
	 * @see org.alinua.dao.UserDAO#getAllUsers()
	 */
	@Override
	public List<User> getAllUsers() {
		
		// Get Criteria Builder
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		
		// Create Criteria Query
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		
		// Specify criteria root
		criteria.from(User.class);
		
		// Execute the query
		List<User> users = sessionFactory.getCurrentSession().createQuery(criteria).getResultList();
		
		return users;
	}

}