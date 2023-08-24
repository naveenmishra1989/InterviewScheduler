package com.sapient.sevices.bo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.sapient.beans.Interviewer;

public interface InterviewerService {
	
	boolean createInterviewer(Interviewer interviewer);
	boolean createScheduledTime(LocalDateTime dateTime);
	List<Interviewer> getAllList();
	Optional<Interviewer> getInterviewerById(int id);
	boolean updateInterviewPriority(int interviewerId, String priority);
	boolean deleteInterviewById(int id);
}
