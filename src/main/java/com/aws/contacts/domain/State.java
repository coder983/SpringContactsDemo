/**
 * 
 */
package com.aws.contacts.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author coder983
 *
 */
@Entity(name="state")
public class State {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long stateid;
	private String name;	
	private String abbrev;	
	
	
	/******************************Getters and Setters**************************/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbrev() {
		return abbrev;
	}
	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}
	public Long getStateid() {
		return stateid;
	}
	public void setStateid(Long stateid) {
		this.stateid = stateid;
	}
	
}
