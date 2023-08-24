package com.sapient.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.beans.Interviewer;
import com.sapient.beans.PropUtilDTO;
import com.sapient.sevices.bo.InterviewerService;
import com.sapient.utils.PropertyUtils;

@RestController //=
@RequestMapping("/interviewer")
public class InterviewerController {
	
	@Autowired
	private PropertyUtils prop;

	@Autowired
	private InterviewerService service;
	
	@GetMapping("/api/allInterviewers")//
	public List<Interviewer> getAllInterviewers() {
		return service.getAllList();
	}

	@GetMapping("/api/selectInterviewerById/{id}")
	public ResponseEntity<Interviewer> getInterviewerById(@PathVariable("id") int ids) {
		Optional<Interviewer> opt = service.getInterviewerById(ids);
		Interviewer interviewer = opt.orElse(null);
		if (interviewer == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(interviewer, HttpStatus.OK);

	}

	@PostMapping("/api/saveInterviewer")
	public ResponseEntity<Interviewer> createInterviewer(@RequestBody Interviewer interviewer) {
		
		boolean status = service.createInterviewer(interviewer);
		if (status)
			return new ResponseEntity<>(interviewer,HttpStatus.ACCEPTED);
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}
	
	@PutMapping("/api/updatePeriority/{id}/{priority}")
	public ResponseEntity<String> updatePriority(@PathVariable int id, @PathVariable String priority) {
		try {
			service.updateInterviewPriority(id, priority);
			return new ResponseEntity<>("id:" + id + " updated with period :" + priority, HttpStatus.CREATED);
		} catch (Exception e) {

			return new ResponseEntity<>(id + ": has not found", HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/api/deleteById")
	public ResponseEntity<String> deleteById(@RequestParam int id) {
		try {
			System.out.println("delete: "+id);
			service.deleteInterviewById(id);
			return new ResponseEntity<>("deleted id: " + id, HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<>("id has not found: " + id, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/api/allInterviewers/prop")
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
