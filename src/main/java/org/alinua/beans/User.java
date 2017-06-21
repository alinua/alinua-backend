/**
 * 
 */
package org.alinua.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Class representing the "USERS" table in the database.
 * 
 * We embed JPA annotations directly into the model class.
 * 
 * @author Yannick ADECHI
 *
 */

@Entity
@Table( name = "USERS")
public class User implements Serializable{

	private Integer id;
	private boolean status;
	private Date register;
	private Profile profile;
	private List<Project> projects;
	private List<Job> jobs;
	private List<Inbox> inboxes;
	
	
	/**
	 * Constructor
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return id
	 */
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "ID")
	public Integer getId() {
		return id;
	}
	
	
	/**
	 * the id to set
	 * @param id 
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	/**
	 * @return status
	 */
	@Column( name = "STATUS")
	public boolean getStatus() {
		return status;
	}

	
	/**
	 * the status to set
	 * @param status 
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	
	/**
	 * @return register
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column( name = "REGISTER_DATE")
	public Date getRegister() {
		return register;
	}

	
	/**
	 * the register date to set
	 * @param register 
	 */
	public void setRegister(Date register) {
		this.register = register;
	}

	
	/**
	 * @return the profile
	 */
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn( name = "PROFILE_ID")
	public Profile getProfile() {
		return profile;
	}


	/**
	 * @param profile the profile to set
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}


	/**
	 * @return the projects
	 */
	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	@JsonIgnore
	public List<Project> getProjects() {
		return projects;
	}


	/**
	 * @param projects the projects to set
	 */
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}


	/**
	 * @return jobs
	*/
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	public List<Job> getJobs() {
		return jobs;
	}


	/**
	 * @param jobs
	*/ 
	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}


	/**
	 * @return the inboxes
	 */
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	public List<Inbox> getInboxes() {
		return inboxes;
	}


	/**
	 * @param inboxes the inboxes to set
	 */
	public void setInboxes(List<Inbox> inboxes) {
		this.inboxes = inboxes;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id= " + id + ", status= " + status + ", register= " + register + ", profile_id= " + profile.getId() + "]";
	}

	
	

}
