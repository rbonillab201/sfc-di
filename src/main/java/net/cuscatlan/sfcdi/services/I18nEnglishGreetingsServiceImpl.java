package net.cuscatlan.sfcdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 4, 2020
 *
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingsServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello from English Greetings Service";
	}

}
