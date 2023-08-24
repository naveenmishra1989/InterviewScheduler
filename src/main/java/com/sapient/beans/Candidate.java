package com.sapient.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int condidateId;
	private String firstName;
	private String lastName;
	private String priority;
	private String slot;
	public int getCondidateId() {
		return condidateId;
	}
	public void setCondidateId(int condidateId) {
		this.condidateId = condidateId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public Candidate(int condidateId, String firstName, String lastName, String priority, String slot) {
		super();
		this.condidateId = condidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.priority = priority;
		this.slot = slot;
	}
	public Candidate() {
		super();
		
	}
	
	
}
