/*package com.sapient.beans;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InterviewSchedule {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int interviewSchedulerId;
	private LocalDateTime start;
	private LocalDateTime end;
	
	@ManyToOne
	private Interviewer interviewer;
	
	@ManyToOne
	private Candidate candidate;

	public int getInterviewSchedulerId() {
		return interviewSchedulerId;
	}

	public void setInterviewSchedulerId(int interviewSchedulerId) {
		this.interviewSchedulerId = interviewSchedulerId;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public Interviewer getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(Interviewer interviewer) {
		this.interviewer = interviewer;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	
	

}
*/