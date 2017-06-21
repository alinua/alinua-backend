/**
 * 
 */
package org.alinua.dao;

import java.util.List;

import org.alinua.beans.Inbox;
import org.alinua.beans.User;

/**
 * DAO(Data Access Object) interface handling "INBOXES" table
 * 
 * @author Yannick ADECHI
 *
 */
public interface InboxDAO {

	/**
	 * Save an inbox in the database
	 * 
	 * @param inbox
	 */
	void saveInbox(Inbox inbox);
	
	
	/**
	 * Update inbox informations in the database
	 * 
	 * @param inbox
	 */
	void updateInbox(Inbox inbox);
	
	
	/**
	 * Delete an inbox in the database
	 * 
	 * @param inbox
	 */
	void deleteInbox(Inbox inbox);
	

	/**
	 * Find an inbox in the database using his id
	 * 
	 * @param id
	 * @return inbox
	 */
	Inbox findInbox(Integer id);
	
	
	/**
	 * Retrieve all the inboxes stored in the database
	 * 
	 * @return List<Inbox>
	 */
	List<Inbox> getAllInboxes();
}
