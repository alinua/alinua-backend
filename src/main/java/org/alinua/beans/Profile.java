/**
 * 
 */
package org.alinua.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * Class representing the "PROFILE" table in the database
 * 
 * @author Yannick ADECHI
 *
 */

//@Entity
//@Table( name = "PROFILE")
public class Profile{

	private Integer id;
	private String first_name;
	private String last_name;
	private String location;
	private Date birthday;
	
	private User user;
	
	
	/**
	 * Constructor
	 */
	public Profile() {
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
	 * @return the first_name
	 */
	//@Column( name = "FIRST_NAME")
	public String getFirst_name() {
		return first_name;
	}


	/**
	 * @param first_name 
	 * the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	/**
	 * @return the last_name
	 */
	//@Column( name = "LAST_NAME")
	public String getLast_name() {
		return last_name;
	}


	/**
	 * @param last_name 
	 * the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	/**
	 * @return the location
	 */
	//@Column( name = "LOCATION")
	public String getLocation() {
		return location;
	}


	/**
	 * @param location 
	 * the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}


	/**
	 * @return the birthday
	 */
	//@Temporal(TemporalType.DATE)
	//@Column( name = "BIRTHDAY_DATE")
	public Date getBirthday() {
		return birthday;
	}


	/**
	 * @param birthday 
	 * the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	/**
	 * @return the user
	*/ 
	//@OneToOne( cascade = CascadeType.ALL)
	//@JoinColumn( name = "USER_ID")
	public User getUser() {
		return user;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @param user 
	 * the user to set
	*/ 
	public void setUser(User user) {
		this.user = user;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [id=" + id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", location=" + location
				+ ", birthday=" + birthday + ", id_user=" + user.getId() +" ]";
	}
	
	
}
