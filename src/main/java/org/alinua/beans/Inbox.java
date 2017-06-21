/**
 * 
 */
package org.alinua.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Yannick ADECHI
 *
 */
@Entity
@Table( name = "INBOXES")
public class Inbox implements Serializable{

	private Integer id;
	private boolean status;
	private Date date;
	private String title;
	private String content;
	private User user;
	//private List<User> members;
	
	
	/**
	 * 
	 */
	public Inbox() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
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
	 * @return the status
	 */
	@Column( name = "STATUS")
	public boolean isStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}


	/**
	 * @return the date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column( name = "CREATED")
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the title
	 */
	@Column( name = "TITLE")
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
	 * @return the content
	 */
	@Column( name = "CONTENT")
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
	 * @return the user
	 */
	@ManyToOne
	@JoinColumn( name = "USER_ID")
	public User getUser() {
		return user;
	}


	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}


	/**
	 * @return the members
	 
	@JsonIgnore
	public List<User> getMembers() {
		return members;
	}


	/**
	 * @param members the members to set
	 
	public void setMembers(List<User> members) {
		this.members = members;
	}
	*/

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Inbox [id=" + id + ", status=" + status + ", date=" + date + ", title=" + title + ", content=" + content
				+ ", user=" + user.getId() + "]";
	}
	
}
