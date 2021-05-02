package com.topworth.app.candidate.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topworth.app.candidate.model.Candidate;
import com.topworth.app.candidate.service.CandidateService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CandidateController {

	@Autowired
	private CandidateService service;
	
	@GetMapping("/getTopWorthPeople")
	public List<Candidate> getListOfTopWorth() {
		return service.getTopWorthFromForbs400();
	}
}
