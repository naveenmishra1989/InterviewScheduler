package com.sapient.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.beans.Candidate;
import com.sapient.beans.PropUtilDTO;
import com.sapient.sevices.bo.CandidateService;
import com.sapient.utils.PropertyUtils;

@RestController //
@RequestMapping("/candidate")
public class CandidateController {
	
	@Autowired
	private PropertyUtils prop;

	@Autowired
	private CandidateService candidateService;
	
	

	@GetMapping("/api/allCandidates") 
	public List<Candidate> getAllCandidates() {
		return candidateService.getAllList();
	}

	@GetMapping("/api/selectCandidateById/{id}")
	public ResponseEntity<Candidate> getCandidateById(@PathVariable int id) {
		Optional<Candidate> opt = candidateService.getCandidateById(id);
		Candidate candidate = opt.orElse(null);
		if (candidate == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(candidate, HttpStatus.OK);

	}

	@PostMapping("/api/saveCandidate")
//	@Consumes("application/x-www-form-urlencoded")//@RequestBody 
	public ResponseEntity<String> createCandidate(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("priority") String priority,@RequestParam("customRadio") String slot) {
		//HttpServletRequest request;
		//@RequestParam("fname") = request.getParameter("fname");
	
		Candidate candidate = new Candidate();
		candidate.setFirstName(fname);
		candidate.setLastName(lname);
		candidate.setPriority(priority);
		candidate.setSlot(slot);
		boolean status = candidateService.createCandidate(candidate);
		if (status)
			return new ResponseEntity<>("created id: "+candidate.getCondidateId(), HttpStatus.CREATED);
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}

	@PutMapping("/api/updatePeriority/{id}/{priority}")
	public ResponseEntity<String> updatePriority(@PathVariable int id, @PathVariable String priority) {
		try {
			candidateService.updateCandidatePriority(id, priority);
			return new ResponseEntity<>("id:" + id + " updated with period :" + priority, HttpStatus.CREATED);
		} catch (Exception e) {

			return new ResponseEntity<>(id + ": has not found", HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/api/deleteById")
	public ResponseEntity<String> deleteById(@RequestParam int id) {
		try {
			candidateService.deleteCandidateById(id);
			return new ResponseEntity<>("deleted id: " + id, HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<>("id has not found: " + id, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/api/allCandidates/prop")
	public PropUtilDTO getAllCandidatesTest() {
		PropUtilDTO dto = new PropUtilDTO();
		dto.setS1(prop.slot1);
		dto.setS3(prop.slot3);
		dto.setS2(prop.slot2);
		dto.setP1(prop.priority1);
		dto.setP2(prop.priority2);
		return dto;
	}
}
