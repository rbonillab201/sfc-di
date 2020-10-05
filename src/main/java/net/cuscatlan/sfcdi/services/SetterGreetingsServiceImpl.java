package net.cuscatlan.sfcdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingsServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello from Setter Service";
	}

}
