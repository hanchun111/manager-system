package cn.com.hfut.model;

import java.util.Date;

public class AdminRole{
	private int adminId;
	
	private int roleId;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	@Override
	public String toString() {
		return "AdminRole [adminId=" + adminId + ", roleId=" + roleId + "]";
	}
	
}