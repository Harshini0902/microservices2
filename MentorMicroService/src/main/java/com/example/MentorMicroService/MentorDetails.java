package com.example.MentorMicroService;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mentor_details")
public class MentorDetails {
	@Id
	private String userName;
	private String password;
	private String fullName;
	private int fees=20000;
	private int commission;
	private String isBlocked="unblocked";
	private String courseName;
	private String linkedinUrl;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public String getIsBlocked() {
		return isBlocked;
	}
	public void setIsBlocked(String isBlocked) {
		this.isBlocked = isBlocked;
	}
	
//	@ManyToOne
//	@JoinColumn(name="calendar_num")
//	private MentorCalendar mentorCalendar;
//	@JsonIgnore
//	public MentorCalendar getMentorCalendar() {
//		return mentorCalendar;
//	}
//	public void setMentorCalendar(MentorCalendar mentorCalendar) {
//		this.mentorCalendar = mentorCalendar;
//	}
//
//	@ManyToMany
//	private List<MentorTechnologies> mentorTechnologies;
//	public List<MentorTechnologies> getMentorTechnologies() {
//		return mentorTechnologies;
//	}
//	public void setMentorTechnologies(List<MentorTechnologies> mentorTechnologies) {
//		this.mentorTechnologies = mentorTechnologies;
//	}
//
//	@ManyToMany
//	private List<Trainings> trainings;
//	public List<Trainings> getTrainings() {
//		return trainings;
//	}
//	public void setTrainings(List<Trainings> trainings) {
//		this.trainings = trainings;
//	}
//
//
}
