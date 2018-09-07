package cn.com.hfut.dao;



import java.util.List;

import cn.com.hfut.model.AdminInfo;

public interface AdminInfoMapper{
	
	public AdminInfo selectAdminInfoByPrimaryKey(int adminId);
	
	public List<AdminInfo> selectAllAdminInfo();
}