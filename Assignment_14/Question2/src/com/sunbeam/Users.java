package com.sunbeam;

public class Users {
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String passwd;
	private String bdate;
	private boolean status;
	private String role;

	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	public Users(int id, String first_name, String last_name, String email, String passwd, String bdate, boolean status,
			String role) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.passwd = passwd;
		this.bdate = bdate;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		bdate = bdate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", passwd=" + passwd + ", Bdate=" + bdate + ", status=" + status + ", role=" + role + "]";
	}
	
	

}
