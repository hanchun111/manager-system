package cn.com.hfut.model;

import java.util.Date;

public class AdminInfo{
	
	private int adminId;
	
	private String admincode;
	
	private String password;
	
	private String name;
	
	private String telephone;
	
	private String email;
	
	private Date enrollDate;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdmincode() {
		return admincode;
	}

	public void setAdmincode(String admincode) {
		this.admincode = admincode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "AdminInfo [adminId=" + adminId + ", admincode=" + admincode + ", password=" + password + ", name="
				+ name + ", telephone=" + telephone + ", email=" + email + ", enrollDate=" + enrollDate + "]";
	}


}