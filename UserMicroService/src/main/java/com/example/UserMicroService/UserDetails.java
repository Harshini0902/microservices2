package com.example.UserMicroService;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
	@Id
	private String userName;
	private String password;
	private String fullName;

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

//	@ManyToMany
//	private List<Trainings> trainings;
//	public List<Trainings> getTrainings() {
//		return trainings;
//	}
//	public void setTrainings(List<Trainings> trainings) {
//		this.trainings = trainings;
//	}
}
