package cn.com.hfut.service;

import java.util.List;

import cn.com.hfut.model.AdminInfo;

public interface AdminInfoService{
	
	public AdminInfo getAdminInfoByPrimaryKey(int adminId);
	
	public List<AdminInfo> getAllAccount();
	
}