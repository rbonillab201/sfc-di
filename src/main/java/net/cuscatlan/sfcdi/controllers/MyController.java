package net.cuscatlan.sfcdi.controllers;

import org.springframework.stereotype.Controller;

import net.cuscatlan.sfcdi.services.GreetingService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 3, 2020
 *
 */
@Controller
public class MyController {
	
	public final GreetingService greetingService;	
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayHello();
	}

}
