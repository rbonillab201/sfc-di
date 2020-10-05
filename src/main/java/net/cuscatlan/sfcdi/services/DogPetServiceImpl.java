package net.cuscatlan.sfcdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */
@Profile("dog")
@Service
public class DogPetServiceImpl implements PetService {

	@Override
	public String getPetType() {
		return "Los Perros son los mejores";
	}

}
