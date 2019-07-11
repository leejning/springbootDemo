package com.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Service.AccountService;
import com.springboot.pojo.Account;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	
	@GetMapping("getAccount")
	@ResponseBody
	public Object getAccount() {
		return accountService.getAccount();
	}
	
	@PostMapping("addAccount")
	@ResponseBody
	public Object addAccount(@RequestBody Account account) {
		System.out.println(account);
		return accountService.getAccount();
	}
}
