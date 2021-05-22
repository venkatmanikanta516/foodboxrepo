package com.mjava.foodbox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="tbl_categeory")
@Table(name="tbl_categeory")
public class Categeory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int catid ;
	private String catName;
	private String catimglink;
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatimglink() {
		return catimglink;
	}
	public void setCatimglink(String catimglink) {
		this.catimglink = catimglink;
	}
	
	
	
}
