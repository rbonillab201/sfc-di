package net.cuscatlan.sfcdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 3, 2020
 *
 */
@Controller
public class MyController {
	
	
	public String sayHello() {
		
		System.out.println("Hola Mundo");
		return "Hola a todos";
	}

}
