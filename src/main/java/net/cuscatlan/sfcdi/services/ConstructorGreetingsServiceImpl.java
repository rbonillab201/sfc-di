package net.cuscatlan.sfcdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 4, 2020
 *
 */

@Service
public class ConstructorGreetingsServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello from Constructor Service";
	}

}
