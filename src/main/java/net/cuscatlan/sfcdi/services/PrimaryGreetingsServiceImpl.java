package net.cuscatlan.sfcdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 4, 2020
 *
 */

@Primary
@Service
public class PrimaryGreetingsServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello from Primary Service";
	}

}
