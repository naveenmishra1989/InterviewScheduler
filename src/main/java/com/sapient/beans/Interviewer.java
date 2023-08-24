package com.sapient.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Interviewer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int interviewerId;
	private String firstName;
	private String lastName;
	private String priority;
	private String slot;
	private String managerEmailId;
	public int getInterviewerId() {
		return interviewerId;
	}
	public void setInterviewerId(int interviewerId) {
		this.interviewerId = interviewerId;
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
	
	public Interviewer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getManagerEmailId() {
		return managerEmailId;
	}
	public void setManagerEmailId(String managerEmailId) {
		this.managerEmailId = managerEmailId;
	}
	

}
