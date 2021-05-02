package com.topworth.app.candidate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topworth.app.candidate.model.Candidate;
import com.topworth.app.candidate.repository.ICandidateRepository;

@Service
public class CandidateService {

	private String forbs400Url;
	
	@Autowired
	private ICandidateRepository repo;
	
	public List<Candidate> getTopWorthFromForbs400() {
		return repo.findAll();
	}
}
