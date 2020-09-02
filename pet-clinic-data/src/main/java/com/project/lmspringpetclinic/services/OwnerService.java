package com.project.lmspringpetclinic.services;

import java.util.Set;

import com.project.lmspringpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	
	Owner findByLastName(String lastName);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
