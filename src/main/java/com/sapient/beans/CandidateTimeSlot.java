/*package com.sapient.beans;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CandidateTimeSlot {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int cand_Time_Slot_Id;
	
	private LocalDateTime start;
	private LocalDateTime end;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Candidate candidate;
	
	public int getCand_Time_Slot_Id() {
		return cand_Time_Slot_Id;
	}

	public void setCand_Time_Slot_Id(int cand_Time_Slot_Id) {
		this.cand_Time_Slot_Id = cand_Time_Slot_Id;
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

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	
}
*/