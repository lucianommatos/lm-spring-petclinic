package com.project.lmspringpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.lmspringpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
