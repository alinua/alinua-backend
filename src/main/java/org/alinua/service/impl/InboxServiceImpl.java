/**
 * 
 */
package org.alinua.service.impl;

import java.util.List;

import org.alinua.beans.Inbox;
import org.alinua.dao.InboxDAO;
import org.alinua.service.InboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yannick ADECHI
 *
 */
@Transactional
@Service("InboxService")
public class InboxServiceImpl implements InboxService {

	@Autowired
	private InboxDAO dao;
	/* (non-Javadoc)
	 * @see org.alinua.service.InboxService#saveInbox(org.alinua.beans.Inbox)
	 */
	@Override
	public void saveInbox(Inbox inbox) {
		// TODO Auto-generated method stub
		dao.saveInbox(inbox);
	}

	/* (non-Javadoc)
	 * @see org.alinua.service.InboxService#updateInbox(org.alinua.beans.Inbox)
	 */
	@Override
	public void updateInbox(Inbox inbox) {
		// TODO Auto-generated method stub
		dao.updateInbox(inbox);
	}

	/* (non-Javadoc)
	 * @see org.alinua.service.InboxService#deleteInbox(org.alinua.beans.Inbox)
	 */
	@Override
	public void deleteInbox(Inbox inbox) {
		// TODO Auto-generated method stub
		dao.deleteInbox(inbox);
	}

	/* (non-Javadoc)
	 * @see org.alinua.service.InboxService#findInbox(java.lang.Integer)
	 */
	@Override
	public Inbox findInbox(Integer id) {
		// TODO Auto-generated method stub
		return dao.findInbox(id);
	}

	/* (non-Javadoc)
	 * @see org.alinua.service.InboxService#getAllInboxes()
	 */
	@Override
	public List<Inbox> getAllInboxes() {
		// TODO Auto-generated method stub
		return dao.getAllInboxes();
	}

}
