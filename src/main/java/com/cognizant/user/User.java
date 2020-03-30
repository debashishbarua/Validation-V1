package com.cognizant.user;

import java.util.List;

public class User {

	private String name;
	private String email;
	private String gender;
	private List<String> languages;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public User(String name, String email, String gender, List<String> languages) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.languages = languages;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	
	
}
