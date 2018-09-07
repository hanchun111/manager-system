package cn.com.hfut.service;

import java.util.List;

import cn.com.hfut.model.Account;


public interface AccountService{
	
	public Account getAccountByPrimaryKey(int accountId);
	
	public List<Account> getAllAccount();
	
	public int insertAccount(Account account);
	
}