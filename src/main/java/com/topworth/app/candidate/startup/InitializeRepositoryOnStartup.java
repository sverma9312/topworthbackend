//package com.topworth.app.candidate.startup;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//import com.topworth.app.candidate.repository.ICandidateRepository;
//
//@Component
//public class InitializeRepositoryOnStartup {
//
//	private ICandidateRepository repo;
//	
//	@Value("${forbs400.url}")
//	private String forbes400Url;
//	
//	@Value("${forbs400.limit}:10")
//	private String limit;
//	
//	
//	@EventListener(ApplicationReadyEvent.class)
//	public void addOrUpdateRecordForbs400() {
//		String forbesUrl = forbes400Url +"?limit="+limit;
//	}
//}
