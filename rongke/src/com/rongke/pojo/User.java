package com.rongke.pojo;

public class User {
	private int id;
	private String uname;
	private String upass;
	public User(int id, String uname, String upass) {
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", upass=" + upass + "]";
	}
	
}
