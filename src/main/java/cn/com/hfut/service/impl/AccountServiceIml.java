package cn.com.hfut.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import cn.com.hfut.dao.AccountMapper;
import cn.com.hfut.model.Account;
import cn.com.hfut.service.AccountService;

@Service("accountService")
public class AccountServiceIml implements AccountService{
	
	@Resource
	AccountMapper accountMapper;

	@Override
	public Account getAccountByPrimaryKey(int accountId) {
		
		return accountMapper.selectAccountByPrimaryKey(accountId);
		
	}

	@Override
	public List<Account> getAllAccount() {
		return accountMapper.selectAllAccount();
	}

	@Override
	public int insertAccount(Account account) {
		return accountMapper.insertAccount(account);
	}
	
	
}