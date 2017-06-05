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
 * Implementation of the DAO(Data Access Object) interface {@link org.alinua.dao.UserDAO}
 * For CRUD(Create Read Update Delete) operations on user entity.
 * 
 * @author Yannick ADECHI
 *
 */
@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	/**
	 * Save user's informations in the database
	 * @param user
	 * @see org.alinua.dao.UserDAO#saveUser(User)
	 */
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(user);
	}

	
	/**
	 * Update user's informations in the database
	 * @param user
	 * @see org.alinua.dao.UserDAO#updateUser(User)
	 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(user);
	}

	
	/**
	 * Delete an user in the database
	 * @param user
	 * @see org.alinua.dao.UserDAO#deleteUser(Integer)
	 */
	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(user);
	}

	
	/**
	 * Find an user in the database using his id
	 * @param id
	 * @return user | null
	 * @see org.alinua.dao.UserDAO#findUser(Integer)
	 */
	@Override
	public User findUser(Integer id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(User.class, id);
	}
	
	
	/** 
	 * Return all the users stored in the database
	 * @return users | null
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
