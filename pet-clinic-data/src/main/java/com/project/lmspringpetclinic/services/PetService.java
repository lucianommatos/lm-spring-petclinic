package com.project.lmspringpetclinic.services;

import java.util.Set;

import com.project.lmspringpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
