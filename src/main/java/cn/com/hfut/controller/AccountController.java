package cn.com.hfut.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.hfut.model.Account;
import cn.com.hfut.service.AccountService;

@RestController
@RequestMapping("/user")
public class AccountController{
	
	@Resource
	private AccountService accountService;
	
	@RequestMapping("/show")
	@ResponseBody
	public Account show() {
		Account account = accountService.getAccountByPrimaryKey(1005);
		System.out.print(account.toString());
		return account;
	}
}