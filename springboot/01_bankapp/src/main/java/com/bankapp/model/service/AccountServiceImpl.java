package com.bankapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entity.Account;
import com.bankapp.model.presistance.AccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepo;
	
	@Autowired
	public AccountServiceImpl(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}

	@Override
	public List<Account> getAll() {
		return accountRepo.findAll();
	}

	@Override
	public Account getById(int id) {
		return null;
	}

	@Override
	public void updateAccount(Account account) {

	}

	@Override
	public void transfer(int fromAccNo, int toAccountNo, double amount) {

	}

	@Override
	public void deposit(int accNo, double amount) {

	}

	@Override
	public void withdraw(int accNo, double amount) {

	}

	@Override
	public void createAccount(Account account) {

	}

}
