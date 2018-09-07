package cn.com.hfut.dao;



import java.util.List;

import cn.com.hfut.model.Account;


public interface AccountMapper{
	
	public Account selectAccountByPrimaryKey(int accountId);
	
	public List<Account> selectAllAccount();
	
	public int insertAccount(Account account);

	
	
}