package com.sapient.beans;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InterviewTimer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int timerId;
	private int interviewId;
	private int cadidateId;
	private LocalDateTime dateTime;
	private char interviewerAvailability;
	private char candidateAvailability;
	public int getTimerId() {
		return timerId;
	}
	public void setTimerId(int timerId) {
		this.timerId = timerId;
	}
	public int getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}
	public int getCadidateId() {
		return cadidateId;
	}
	public void setCadidateId(int cadidateId) {
		this.cadidateId = cadidateId;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public char getInterviewerAvailability() {
		return interviewerAvailability;
	}
	public void setInterviewerAvailability(char interviewerAvailability) {
		this.interviewerAvailability = interviewerAvailability;
	}
	public char getCandidateAvailability() {
		return candidateAvailability;
	}
	public void setCandidateAvailability(char candidateAvailability) {
		this.candidateAvailability = candidateAvailability;
	}

}
