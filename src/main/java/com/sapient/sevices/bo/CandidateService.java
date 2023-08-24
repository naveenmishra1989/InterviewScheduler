package com.sapient.sevices.bo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.sapient.beans.Candidate;

public interface CandidateService {
	boolean createCandidate(Candidate candidate);
	boolean createScheduledTime(LocalDateTime dateTime);
	List<Candidate> getAllList();
	Optional<Candidate> getCandidateById(int id);
	boolean updateCandidatePriority(int CandidateId, String priority);
	boolean deleteCandidateById(int id);

}
