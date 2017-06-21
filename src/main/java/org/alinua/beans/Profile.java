/**
 * 
 */
package org.alinua.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Yannick ADECHI
 *
 */

@Entity
@Table( name = "PROFILES")
public class Profile implements Serializable{

	private Integer id;
	private String firstName;
	private String lastName;
	private String headline;
	private String summary;
	private String emailAdress;
	private String industry;
	private String pictureUrl;
	private String location;
	
	
	/**
	 * 
	 */
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id
	 */
	@Id
	@Column( name = "ID")
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
	 * @return the firstName
	 */
	@Column( name = "FIRSTNAME")
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	@Column( name = "LASTNAME")
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the headline
	 */
	@Column( name = "HEADLINE")
	public String getHeadline() {
		return headline;
	}


	/**
	 * @param headline the headline to set
	 */
	public void setHeadline(String headline) {
		this.headline = headline;
	}


	/**
	 * @return the summary
	 */
	@Column( name = "SUMMARY")
	public String getSummary() {
		return summary;
	}


	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}


	/**
	 * @return the emailAdress
	 */
	@Column( name = "EMAILADRESS")
	public String getEmailAdress() {
		return emailAdress;
	}


	/**
	 * @param emailAdress the emailAdress to set
	 */
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}


	/**
	 * @return the industry
	 */
	@Column( name = "INDUSTRY")
	public String getIndustry() {
		return industry;
	}


	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}


	/**
	 * @return the pictureUrl
	 */
	@Column( name = "PICTUREURL")
	public String getPictureUrl() {
		return pictureUrl;
	}


	/**
	 * @param pictureUrl the pictureUrl to set
	 */
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}


	/**
	 * @return the location
	 */
	@Column( name = "LOCATION")
	public String getLocation() {
		return location;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", headline=" + headline
				+ ", summary=" + summary + ", emailAdress=" + emailAdress + ", industry=" + industry + ", pictureUrl="
				+ pictureUrl + ", location=" + location + "]";
	}
	
	
	
}
