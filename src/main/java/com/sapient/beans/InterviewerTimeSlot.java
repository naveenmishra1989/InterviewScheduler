/*package com.sapient.beans;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class InterviewerTimeSlot {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int ivr_Time_Slot_Id;
	
	private LocalDateTime start;
	private LocalDateTime end;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Interviewer interviewer;
	public int getIvr_Time_Slot_Id() {
		return ivr_Time_Slot_Id;
	}

	public void setIvr_Time_Slot_Id(int ivr_Time_Slot_Id) {
		this.ivr_Time_Slot_Id = ivr_Time_Slot_Id;
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

	
}
*/