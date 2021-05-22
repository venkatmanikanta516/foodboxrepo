package com.mjava.foodbox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="tbl_register")
@Table(name="tbl_register")
public class Register {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id ;
     private String  firstName ;
	 private String  lastName ;
	 private String  password ;
	 private Long  phno ;
	 private String   email ;
	 private Long  pincode ;
	 private int rollid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	 
	 
	public int getRollid() {
		return rollid;
	}
	public void setRollid(int rollid) {
		this.rollid = rollid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
