package net.cuscatlan.sfcdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.cuscatlan.sfcdi.services.PropertyGreetingsServiceImpl;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 4, 2020
 *
 */

class SetterInyectionControllerTest {


	SetterInyectionController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new SetterInyectionController();
		controller.setGreetingService(new PropertyGreetingsServiceImpl());
		
	}

	@Test
	void test() {
		System.out.println(controller.getGreeting());;
	}

}
