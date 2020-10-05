package net.cuscatlan.sfcdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */

@Profile("cat")
@Service
public class CatPetServiceImpl implements PetService {

	@Override
	public String getPetType() {
		return "Los Gatos son los mejores";
	}

}
