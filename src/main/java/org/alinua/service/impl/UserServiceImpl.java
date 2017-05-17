/**
 * 
 */
package org.alinua.service.impl;

import java.util.List;

import org.alinua.beans.User;
import org.alinua.dao.UserDAO;
import org.alinua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yann
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;
	
	
	@Override
	@Transactional
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		dao.saveUser(user);
	}

	
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		dao.updateUser(user);
	}

	
	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteUser(id);
	}

	
	@Override
	public User findUser(Integer id) {
		// TODO Auto-generated method stub
		return dao.findUser(id);
	}
	
	
	/* (non-Javadoc)
	 * @see org.alinua.service.UserService#getAllUsers()
	 */
	@Override
	@Transactional( readOnly = true)
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}
}
