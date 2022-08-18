package com.bankapp.api;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.model.entity.Account;
import com.bankapp.model.service.AccountService;

@RestController
@RequestMapping(path="api")
public class TransactionRestApi {

	private AccountService accountService;
	
	@Autowired
	public TransactionRestApi(AccountService accountService) {
		this.accountService = accountService;
	}

	@GetMapping(path = "accounts")
	public  List<Account> getAllAccounts() {
		return accountService.getAll();
		
	}
	

}
