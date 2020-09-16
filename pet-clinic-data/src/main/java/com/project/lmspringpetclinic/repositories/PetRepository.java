package com.project.lmspringpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.lmspringpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
