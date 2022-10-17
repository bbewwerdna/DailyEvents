package com.example.backend.modal;

import org.springframework.data.mongodb.core.mapping.Field;

public class day {

	@Field("hours")
	private String hours;
	@Field("description")
	private String description;
	@Field("cost")
	private String cost;
	
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	
}
