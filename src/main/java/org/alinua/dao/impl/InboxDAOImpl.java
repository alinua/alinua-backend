/**
 * 
 */
package org.alinua.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.alinua.beans.Inbox;
import org.alinua.beans.Project;
import org.alinua.beans.User;
import org.alinua.dao.InboxDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Implementation of the DAO(Data Access Object) interface {@link org.alinua.dao.InboxDAO}
 * For CRUD(Create Read Update Delete) operations on inbox entity
 * 
 * @author Yannick ADECHI
 *
 */
@Repository("InboxDAO")
public class InboxDAOImpl implements InboxDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	/* (non-Javadoc)
	 * @see org.alinua.dao.InboxDAO#saveInbox(org.alinua.beans.Inbox)
	 */
	@Override
	public void saveInbox(Inbox inbox) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(inbox);
	}

	/* (non-Javadoc)
	 * @see org.alinua.dao.InboxDAO#updateInbox(org.alinua.beans.Inbox)
	 */
	@Override
	public void updateInbox(Inbox inbox) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(inbox);
	}

	/* (non-Javadoc)
	 * @see org.alinua.dao.InboxDAO#deleteInbox(org.alinua.beans.Inbox)
	 */
	@Override
	public void deleteInbox(Inbox inbox) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(inbox);
	}

	/* (non-Javadoc)
	 * @see org.alinua.dao.InboxDAO#findInbox(java.lang.Integer)
	 */
	@Override
	public Inbox findInbox(Integer id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Inbox.class, id);
	}

	/* (non-Javadoc)
	 * @see org.alinua.dao.InboxDAO#getAllInboxes()
	 */
	@Override
	public List<Inbox> getAllInboxes() {
		// Get Criteria Builder
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
					
		// Create Criteria Query
		CriteriaQuery<Inbox> criteria = builder.createQuery(Inbox.class);
						
		// Specify criteria root
		criteria.from(Inbox.class);
						
		// Execute the query
		List<Inbox> inboxes = sessionFactory.getCurrentSession().createQuery(criteria).getResultList();
						
		return inboxes;
	}

}
