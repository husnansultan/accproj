package com.qa.logic.domain;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

	public int searchAccounts(String firstName) {

		List<Account> newlist = (accounts.values().stream()
				.filter(a -> a.getFirstName() == firstName)
				.collect(Collectors.toList()));
		return newlist.size();

	}
}
