package com.project.lmspringpetclinic.services;

import com.project.lmspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findById(Long id);

}
