/**
 * 
 */
package com.aws.contacts.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Andrew Soloninka
 *
 */
@Entity(name="contact")
public class Contact {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long contactid;
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String email;
	private String phone;
	
	/****************************************Getters and Setters**********************************************/
	public Long getContactid() {
		return contactid;
	}
	public void setContactid(Long contactid) {
		this.contactid = contactid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
