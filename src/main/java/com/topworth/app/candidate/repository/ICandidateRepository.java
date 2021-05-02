package com.topworth.app.candidate.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topworth.app.candidate.model.Candidate;

public interface ICandidateRepository extends JpaRepository<Candidate, UUID>{

}
