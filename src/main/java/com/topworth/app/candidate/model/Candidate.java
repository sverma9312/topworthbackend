package com.topworth.app.candidate.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {

	@Id
	private UUID id;
	
	private String name;

	private String country;
	
	private Long netWorth;
	
	private String currency;
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(Long netWorth) {
		this.netWorth = netWorth;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Override
	public String toString() {
		return "Name:" +name+" | NetWorth:"+netWorth+" | Country:"+country;
	}
}
