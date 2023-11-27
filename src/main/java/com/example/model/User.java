package com.example.model;

import java.sql.Date;

public class User {
	
	private String startTime;
	private String endTime;
	private String location;
	private int cost;
	private int volunteerAmount;
	private String eventName;
	private String eventDescription;
	private String edate;
	
	
	@Override
	public String toString() {
		return "User [edate=" + edate + ", startTime=" + startTime + ", endTime=" + endTime + ", location=" + location
				+ ", cost=" + cost + ", volunteerAmount=" + volunteerAmount + ", eventName=" + eventName
				+ ", eventDescription=" + eventDescription + "]";
	}
	
	
	
	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getVolunteerAmount() {
		return volunteerAmount;
	}
	public void setVolunteerAmount(int volunteerAmount) {
		this.volunteerAmount = volunteerAmount;
	}
	
	
}
