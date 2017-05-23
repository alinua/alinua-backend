/**
 * 
 */
package org.alinua.beans;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class representing the "USERS" table in the database
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
	//private List<Job> jobs;
	
	
	/**
	 * Constructor
	 */
	public User() {
		super();
		//this.jobs = null;
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return Integer
	 */
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "ID")
	public Integer getId() {
		return id;
	}
	
	
	/**
	 * the id to set
	 * @param Integer 
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	/**
	 * @return String
	 */
	@Column( name = "USERNAME")
	public String getUsername() {
		return username;
	}

	
	/**
	 * the username to set
	 * @param String 
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	
	/**
	 * @return String
	 */
	@Column( name = "EMAIL")
	public String getEmail() {
		return email;
	}

	
	/**
	 * the email to set
	 * @param String 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
	/**
	 * @return Timestamp
	*/
	//@Temporal(TemporalType.TIMESTAMP)
	@Column( name = "LAST_CONNECTION_DATE")
	public Timestamp getLastConnection() {
		return last_connection;
	}

	
	/**
	 * @param Timestamp 
	 * the connection to set
	*/ 
	public void setLastConnection(Timestamp last_connection) {
		this.last_connection = last_connection;
	}

	
	/**
	 * @return List<Job>
	
	//@OneToMany( mappedBy = "user", cascade = CascadeType.ALL)
	//@OrderBy("POSTED_DATE")
	public List<Job> getJobs() {
		return jobs;
	}


	/**
	 * @param List<Job>
	 
	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}*/

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", last_connection=" + last_connection +"  ]";
	}

}
