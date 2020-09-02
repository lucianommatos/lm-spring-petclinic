package com.project.lmspringpetclinic.services;

import java.util.Set;

import com.project.lmspringpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();

}
