/**
 * 
 */
package org.alinua.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

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
	private String username;
	private String email;
	private Timestamp last_connection;
	private List<Job> jobs;
	
	
	/**
	 * Constructor
	 */
	public User() {
		super();
		last_connection = new Timestamp(1444444444);
		//this.jobs = null;
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
	 * @return username
	 */
	@Column( name = "USERNAME")
	public String getUsername() {
		return username;
	}

	
	/**
	 * the username to set
	 * @param username 
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	
	/**
	 * @return email
	 */
	@Column( name = "EMAIL")
	public String getEmail() {
		return email;
	}

	
	/**
	 * the email to set
	 * @param email 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
	/**
	 * @return last_connection date
	*/
	//@Temporal(TemporalType.TIMESTAMP)
	@Column( name = "LAST_CONNECTION_DATE")
	public Timestamp getLastConnection() {
		return last_connection;
	}

	
	/**
	 * @param last_connection 
	 * the connection to set
	*/ 
	public void setLastConnection(Timestamp last_connection) {
		this.last_connection = last_connection;
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

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", last_connection=" + last_connection +"  ]";
	}

}
