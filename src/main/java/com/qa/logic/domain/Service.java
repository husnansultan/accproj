package com.qa.logic.domain;

import java.util.HashMap;

import com.qa.logic.business.Account;
import com.qa.util.JSONUtil;

public class Service {

	private HashMap<Integer, Account> accounts = new HashMap<>();
	private int counter = 1;
	private JSONUtil json = new JSONUtil();

	public void addAccount(String firstName, String lastName) {
		accounts.put(counter, new Account(firstName, lastName, counter));
		counter++;

	}

	public Account getmyAccount(int accountNumber) {
		return accounts.get(accountNumber);

	}
	
	public String showAccounts() {
		
		return json.getJSONForObject(accounts);

	}
}
