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
@Document(collection = "events")
public class Restaurants{
	
	@Id
	private ObjectId id;
	
	@Field("restaurantName")
	private String restaurantName;
	@Field("street")
	private String street;
	@Field("city")
	private String city;
	@Field("state")
	private String state;
	@Field("zip")
	private int zip;
	@Field("openHours")
	private String openHours;
	@Field("happyHour")
	private HappyHour happyHour;

	
	public Restaurants(ObjectId id, String restaurantName, String street, int zip, String city, String state, String openHours, HappyHour happyHour){
		super();
		this.id =id;
		this.restaurantName=restaurantName;
		this.street = street;
		this.zip=zip;
		this.city=city;
		this.state=state;
		this.openHours=openHours;
		this.happyHour=happyHour;

		
		
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
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
		this.openHours= openHours;
	}
	public HappyHour getHappyHour() {
		return happyHour;
	}

	public void setHappyHour(HappyHour happyHour) {
		this.happyHour = happyHour;
	}
	

}
