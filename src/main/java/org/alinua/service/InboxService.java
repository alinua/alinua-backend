/**
 * 
 */
package org.alinua.service;

import java.util.List;

import org.alinua.beans.Inbox;
import org.alinua.beans.User;

/**
 * Service layer that uses InboxDAO classes
 * 
 * @author Yannick ADECHI
 *
 */
public interface InboxService {

	/**
	 * 
	 * @param inbox
	 */
	void saveInbox(Inbox inbox);
	
	
	/**
	 * 
	 * @param inbox
	 */
	void updateInbox(Inbox inbox);
	
	
	/**
	 * 
	 * 
	 * @param inbox
	 */
	void deleteInbox(Inbox inbox);
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Inbox findInbox(Integer id);
	
	
	/**
	 * 
	 * @return
	 */
	List<Inbox> getAllInboxes();
}
