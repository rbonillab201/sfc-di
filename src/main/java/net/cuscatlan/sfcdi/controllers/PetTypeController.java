package net.cuscatlan.sfcdi.controllers;

import org.springframework.stereotype.Controller;

import net.cuscatlan.sfcdi.services.PetService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */

@Controller
public class PetTypeController {
	
	public final PetService petService;

	public PetTypeController(PetService petService) {
		this.petService = petService;
	}
	
	public String getPet() {
		return petService.getPetType();
	}

}
