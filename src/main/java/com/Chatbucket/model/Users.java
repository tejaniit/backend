package com.Chatbucket.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.CascadeType;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Users {
@Id@GeneratedValue
	private int id;

private String name;
private String password;
private String address;
private String dateofbirth;
private String role;

@Transient
private String imageData;
@Transient
private MultipartFile file;


public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public MultipartFile getFile() {
	return file;
}
public void setFile(MultipartFile file) {
	this.file = file;
}
public String getImageData() {
	return imageData;
}
public void setImageData(String imageData) {
	this.imageData = imageData;
}


	public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
