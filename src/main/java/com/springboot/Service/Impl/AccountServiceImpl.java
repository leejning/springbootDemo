package com.springboot.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Service.AccountService;
import com.springboot.dao.AccountDao;
import com.springboot.pojo.Account;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDao accountDao;

	@Override
	public Account getAccount() {
		return accountDao.findById(1l).get();
	}
	
	
}
