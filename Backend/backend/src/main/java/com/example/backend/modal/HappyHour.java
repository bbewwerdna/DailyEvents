package com.example.backend.modal;

import org.springframework.data.mongodb.core.mapping.Field;

public class HappyHour{
	
	@Field("Sunday")
	private day Sunday;
	@Field("Monday")
	private day Monday;
	@Field("Tuesday")
	private day Tuesday;
	@Field("Wednesday")
	private day Wednesday;
	@Field("Thursday")
	private day Thursday;
	@Field("Friday")
	private day Friday;
	@Field("Saturday")
	private day Saturday;
	
	public day getSunday() {
		return Sunday;
	}
	public void setSunday(day sunday) {
		Sunday = sunday;
	}
	public day getMonday() {
		return Monday;
	}
	public void setMonday(day monday) {
		Monday = monday;
	}
	public day getTuesday() {
		return Tuesday;
	}
	public void setTuesday(day tuesday) {
		Tuesday = tuesday;
	}
	public day getWednesday() {
		return Wednesday;
	}
	public void setWednesday(day wednesday) {
		Wednesday = wednesday;
	}
	public day getThursday() {
		return Thursday;
	}
	public void setThursday(day thursday) {
		Thursday = thursday;
	}
	public day getFriday() {
		return Friday;
	}
	public void setFriday(day friday) {
		Friday = friday;
	}
	public day getSaturday() {
		return Saturday;
	}
	public void setSaturday(day saturday) {
		Saturday = saturday;
	}


	

}
