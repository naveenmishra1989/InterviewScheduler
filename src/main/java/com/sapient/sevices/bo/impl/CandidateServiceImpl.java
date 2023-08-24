package com.sapient.sevices.bo.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.beans.Candidate;
import com.sapient.sevices.bo.CandidateService;
import com.sapient.sevices.dao.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateRepository repo;
	
	@Override
	public boolean createCandidate(Candidate candidate) {
		Candidate candidate2=repo.save(candidate);
		if(candidate2==null) 
		return false;
		return true;
	}

	@Override
	public boolean createScheduledTime(LocalDateTime dateTime) {
		
		return false;
	}

	@Override
	public List<Candidate> getAllList() {
		List<Candidate> candidateList = (List<Candidate>) repo.findAll();
		System.out.println(repo);
		return candidateList;
	}



	@Override
	public boolean updateCandidatePriority(int CandidateId, String priority) {
		
		Optional<Candidate> candidateOptional=repo.findById(CandidateId);
		Candidate candidateNew = candidateOptional.get();
		candidateNew.setPriority(priority);
		Candidate candidate2 = repo.save(candidateNew);
		if(candidate2.getPriority().equals(priority))
		return true;
		return false;
	}

	@Override
	public Optional<Candidate> getCandidateById(int id) {
		
		return repo.findById(new Integer(id));
	}

	@Override
	public boolean deleteCandidateById(int id) {
		 repo.deleteById(id);
			Optional<Candidate> candidateOptional=repo.findById(id);
			Candidate candidateNew = candidateOptional.orElse(null);
			System.out.println("impl  -> "+candidateNew);
			if(candidateNew==null) 
				return true;
				return false;
	}

	

}
