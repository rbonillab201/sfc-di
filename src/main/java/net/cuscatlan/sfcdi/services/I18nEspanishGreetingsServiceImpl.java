package net.cuscatlan.sfcdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 4, 2020
 *
 */
@Profile("ES")
@Service("i18nService")
public class I18nEspanishGreetingsServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Hola desde el servicio de saludos";
	}

}
