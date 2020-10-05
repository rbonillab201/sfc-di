package net.cuscatlan.sfcdi.controllers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.cuscatlan.sfcdi.services.PropertyGreetingsServiceImpl;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 4, 2020
 *
 */

class ConstructorInyectionControllerTest {


	private ConstructorInyectionController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new ConstructorInyectionController(new PropertyGreetingsServiceImpl());
	}

	@Test
	void test() {
		System.out.println("---> " + controller.getGreeting());
	}

}
