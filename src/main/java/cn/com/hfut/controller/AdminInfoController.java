package cn.com.hfut.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.json.JsonObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.hfut.model.Account;
import cn.com.hfut.model.AdminInfo;
import cn.com.hfut.service.AccountService;
import cn.com.hfut.service.AdminInfoService;

@RestController
@RequestMapping("/admininfo")
public class AdminInfoController{
	
	@Resource
	private AdminInfoService adminInfoService;
	
	@RequestMapping("/show")
	public AdminInfo show() {
		AdminInfo adminInfo = adminInfoService.getAdminInfoByPrimaryKey(2000);
		System.out.print(adminInfo.toString());
		return adminInfo;
	}
	

}