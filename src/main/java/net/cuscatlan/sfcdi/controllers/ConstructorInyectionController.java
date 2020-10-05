package net.cuscatlan.sfcdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import net.cuscatlan.sfcdi.services.GreetingService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 4, 2020
 *
 */
@Controller
public class ConstructorInyectionController {
	
	private final GreetingService greetingService;

	public ConstructorInyectionController(@Qualifier("constructorGreetingsServiceImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayHello();
	}

}
