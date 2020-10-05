package net.cuscatlan.sfcdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import net.cuscatlan.sfcdi.services.GreetingService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 4, 2020
 *
 */

@Controller
public class I18nController {
	
	public final GreetingService greetingService;
	
	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayHello();
	}

}
