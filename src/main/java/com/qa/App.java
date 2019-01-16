package com.qa;

import com.qa.logic.domain.Service;

public class App {

	public static void main(String[] args) {
		
		Service serv = new Service();
		serv.addAccount("hus", "sul");
		serv.addAccount("husssy", "sulllyy");
		
		System.out.println(serv.showAccounts());
		
	}

}
