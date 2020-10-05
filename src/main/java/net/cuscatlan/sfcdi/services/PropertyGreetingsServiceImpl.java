package net.cuscatlan.sfcdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingsServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello from Property Service";
	}

}
