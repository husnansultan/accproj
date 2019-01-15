package com.qa.logic.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountService {

	
	@Test
	public void createFname() {
		Service serv = new Service();
		serv.addAccount("hus", "sul");
		
		assertEquals("hus", serv.getmyAccount(1).getFirstName());
	}
	
	@Test
	public void createLname() {
		Service serv = new Service();
		serv.addAccount("hus", "sul");
		
		assertEquals("sul", serv.getmyAccount(1).getLastName());
	}
	
	@Test
	public void getACnum() {
		Service serv = new Service();
		serv.addAccount("hus", "sul");
		
		assertEquals(1, serv.getmyAccount(1).getAccountNumber());
	}
}
