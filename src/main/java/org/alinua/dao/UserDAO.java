/**
 * 
 */
package org.alinua.dao;

import java.util.List;

import org.alinua.beans.User;

/**
 * DAO(Data Access Object) interface handling "USERS" table CRUD operations
 * 
 * @author Yannick ADECHI
 *
 */
public interface UserDAO {
	
	/**
	 * Save an user in the database
	 * 
	 * @param user
	 */
	void saveUser(User user);
	
	
	/**
	 * Update user's informations in the database
	 * 
	 * @param user
	 */
	void updateUser(User user);
	
	
	/**
	 * Delete an user in the database
	 * 
	 * @param user
	 */
	void deleteUser(User user);
	

	/**
	 * Find an user in the database using his id
	 * 
	 * @param id
	 * @return user
	 */
	User findUser(Integer id);
	
	
	/**
	 * Retrieve all the users stored in the database
	 * 
	 * @return List<User>
	 */
	List<User> getAllUsers();
}
