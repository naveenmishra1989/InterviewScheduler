package com.sapient.sevices.dao;

import org.springframework.data.repository.CrudRepository;

import com.sapient.beans.Candidate;

public interface CandidateRepository extends CrudRepository<Candidate,Integer> {
	
	

}
