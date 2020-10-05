package net.cuscatlan.sfcdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.cuscatlan.sfcdi.services.PropertyGreetingsServiceImpl;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 4, 2020
 *
 */

class PropertyInyectionControllerTest {


	private PropertyInyectionController propertyInyectionController;
	
	@BeforeEach
	void setUp() throws Exception {
		
		propertyInyectionController = new PropertyInyectionController();
		propertyInyectionController.greetingService = new PropertyGreetingsServiceImpl();
		
	}

	@Test
	void test() {
		System.out.println(propertyInyectionController.getGreeting());;
	}

}
