package cn.com.hfut.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import cn.com.hfut.dao.AdminInfoMapper;
import cn.com.hfut.model.AdminInfo;
import cn.com.hfut.service.AdminInfoService;

@Service("adminInfoService")
public class AdminInfoServiceIml implements AdminInfoService{
	@Resource
	AdminInfoMapper adminInfoMapper;

	@Override
	public AdminInfo getAdminInfoByPrimaryKey(int adminId) {
		
		return adminInfoMapper.selectAdminInfoByPrimaryKey(adminId);
		
	}

	@Override
	public List<AdminInfo> getAllAccount() {
		return adminInfoMapper.selectAllAdminInfo();
	}
}