package com.bankapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.persistance.Account;
import com.bankapp.model.persistance.AccountDao;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	@Autowired
	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAll() {
		//
		return accountDao.getAll();
	}

	@Override
	public Account getById(int id) {
		return accountDao.getById(id);
	}

	@Override
	public void updateAccount(Account account) {
		accountDao.updateAccount(account);
	}

	@Override
	public void transfer(int fromAccNo, int toAccountNo, double amount) {

		Account fromAcc = getById(fromAccNo);
		Account toAcc = getById(toAccountNo);

		fromAcc.setBalance(fromAcc.getBalance() - amount);
		toAcc.setBalance(toAcc.getBalance() + amount);

		accountDao.updateAccount(fromAcc);
		accountDao.updateAccount(toAcc);

		System.out.println("fund is transfer");

	}

	@Override
	public void deposit(int accNo, double amount) {
		Account account = getById(accNo);
		account.setBalance(account.getBalance() + amount);
		accountDao.updateAccount(account);
		System.out.println("deposit is done");
	}

	@Override
	public void withdraw(int accNo, double amount) {
		Account account = getById(accNo);
		account.setBalance(account.getBalance() - amount);
		accountDao.updateAccount(account);
		System.out.println("deposit is done");

	}

}
