package net.cuscatlan.sfcdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import net.cuscatlan.sfcdi.services.GreetingService;

@Controller
public class SetterInyectionController {
	
	
	private GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayHello();
	}

	@Qualifier("setterGreetingsServiceImpl")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	

}
