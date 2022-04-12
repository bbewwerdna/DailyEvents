package com.example.backend.modal;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Data
@Document(collection = "Restaurants")
public class Restaurants extends Special{
	
	@Id
	private ObjectId id;
	
	@Field("restaurantName")
	private String restaurantName;
	@Field("streetAddress")
	private String streetAddress;
	@Field("zipCode")
	private int zipCode;
	@Field("city")
	private String city;
	@Field("state")
	private String state;
	@Field("openHours")
	private String openHours;
	@Field("special")
	private Special special;
	
	public Restaurants(ObjectId id, String restaurantName, String streetAddress, int zipCode, String city, String state, String openHours, Special special){
		super();
		this.id =id;
		this.restaurantName=restaurantName;
		this.streetAddress = streetAddress;
		this.zipCode=zipCode;
		this.city=city;
		this.state=state;
		this.openHours=openHours;
		this.special=special;
	}

	public Special getSpecial() {
		return special;
	}

	public void setSpecial(Special special) {
		this.special = special;
	}

	public ObjectId get_id() {
		return id;
	}

	public void set_id(ObjectId id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOpenHours() {
		return openHours;
	}

	public void setOpenHours(String openHours) {
		this.openHours = openHours;
	}
	

}
