package PasswordData;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class PasswordData {
	
	@Id
private int id;
private String name;
private String email;
private String password;
private String fb;
private String insta;
private String linkdin;
private String snap;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFb() {
	return fb;
}
public void setFb(String fb) {
	this.fb = fb;
}
public String getInsta() {
	return insta;
}
public void setInsta(String insta) {
	this.insta = insta;
}
public String getLinkdin() {
	return linkdin;
}
public void setLinkdin(String linkdin) {
	this.linkdin = linkdin;
}
public String getSnap() {
	return snap;
}
public void setSnap(String snap) {
	this.snap = snap;
}
}
