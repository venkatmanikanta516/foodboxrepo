package com.mjava.foodbox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="tbl_fooditem")
@Table(name="tbl_fooditem")
public class Fooditem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int fid;
private int fcatid;
private String fname;
private int price;
private String fimglink;
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public int getFcatid() {
	return fcatid;
}
public void setFcatid(int fcatid) {
	this.fcatid = fcatid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getFimglink() {
	return fimglink;
}
public void setFimglink(String fimglink) {
	this.fimglink = fimglink;
}

}
