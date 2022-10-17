package com.example.backend.modal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
@Document(collection="specialEvents")
public class Special {
	
	@Id
	private ObjectId id;
	
	@Field("restaurantName")
	private String restaurant;
	@Field("hours")
	private String hours;
	@Field("description")
	private String description;
	@Field("cost")
	private String cost;
	
	
	
	public Special(String restaurant, String hours, String description, String cost) {
		this.restaurant = restaurant;
		this.hours = hours;
		this.description = description;
		this.cost = cost;
	}



	public String getRestaurant() {
		return restaurant;
	}



	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}



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
