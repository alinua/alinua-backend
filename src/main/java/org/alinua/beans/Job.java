/**
 * 
 */
package org.alinua.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * Class representing the "JOB" table in the database
 * 
 * @author Yannick ADECHI
 *
 */

//@Entity
//@Table( name = "JOB")
public class Job{

	private Integer id;
	private String title;
	private String lead;
	private String content;
	private Date posted;
	private Date validity;
	
	private User user;
	
	
	/**
	 * Constructor
	 */
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the id
	 */
	//@Id
	//@GeneratedValue( strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the title
	 */
	//@Column( name = "TITLE")
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the lead
	 */
	//@Column( name = "LEAD")
	public String getLead() {
		return lead;
	}


	/**
	 * @param lead the lead to set
	 */
	public void setLead(String lead) {
		this.lead = lead;
	}


	/**
	 * @return the content
	 */
	//@Column( name = "CONTENT")
	public String getContent() {
		return content;
	}


	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}


	/**
	 * @return the posted
	 */
	//@Temporal(TemporalType.DATE)
	//@Column( name = "POSTED_DATE")
	public Date getPosted() {
		return posted;
	}


	/**
	 * @param posted the posted to set
	 */
	public void setPosted(Date posted) {
		this.posted = posted;
	}


	/**
	 * @return the validity
	 */
	//@Temporal(TemporalType.DATE)
	//@Column( name = "VALIDITY_DATE")
	public Date getValidity() {
		return validity;
	}


	/**
	 * @param validity the validity to set
	 */
	public void setValidity(Date validity) {
		this.validity = validity;
	}


	/**
	 * @return the user
	*/ 
	//@ManyToOne
	//@JoinColumn( name = "USER_ID")
	public User getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	*/ 
	public void setUser(User user) {
		this.user = user;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Announce [id=" + id + ", title=" + title + ", lead=" + lead + ", content=" + content + ", posted="
				+ posted + ", validity=" + validity + ", id_user=" + user.getId() +" ]";
	}
	
	
}
