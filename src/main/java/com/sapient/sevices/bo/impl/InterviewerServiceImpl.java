package com.sapient.sevices.bo.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.beans.Interviewer;
import com.sapient.sevices.bo.InterviewerService;
import com.sapient.sevices.dao.InterviewerRepository;

@Service
public class InterviewerServiceImpl implements InterviewerService {

	@Autowired
	private InterviewerRepository repo;

	@Override
	public boolean createInterviewer(Interviewer interviewer) {
		Interviewer inter = repo.save(interviewer);
		if (inter == null)
			return false;
		return true;

	}

	@Override
	public boolean createScheduledTime(LocalDateTime dateTime) {

		return false;
	}

	@Override
	public List<Interviewer> getAllList() {
		List<Interviewer> interviewer = (List<Interviewer>) repo.findAll();
		return interviewer;
	}

	@Override
	public Optional<Interviewer> getInterviewerById(int id) {

		return repo.findById(new Integer(id));
	}

	@Override
	public boolean updateInterviewPriority(int interviewerId, String priority) {

		Optional<Interviewer> candidateOptional = repo.findById(interviewerId);
		Interviewer candidateNew = candidateOptional.get();
		candidateNew.setPriority(priority);
		Interviewer candidate2 = repo.save(candidateNew);
		if (candidate2.getPriority().equals(priority))
			return true;
		return false;

	}

	@Override
	public boolean deleteInterviewById(int id) {
		repo.deleteById(id);
		Optional<Interviewer> candidateOptional=repo.findById(id);
		Interviewer interviewerNew = candidateOptional.orElse(null);
		if(interviewerNew==null) 
			return true;
			return false;
	}

	

}
