/**
 * 
 */
package org.alinua.service;

import java.util.List;

import org.alinua.beans.User;

/**
 * Service layer that uses UserDAO classes
 * 
 * @author Yannick ADECHI
 *
 */
public interface UserService {

	/**
	 * 
	 * @param user
	 */
	void saveUser(User user);
	
	
	/**
	 * 
	 * @param user
	 */
	void updateUser(User user);
	
	
	/**
	 * 
	 * 
	 * @param user
	 */
	void deleteUser(User user);
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	User findUser(Integer id);
	
	
	/**
	 * 
	 * @return
	 */
	List<User> getAllUsers();
}
