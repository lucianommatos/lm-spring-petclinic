package com.project.lmspringpetclinic.services.map;

import java.util.Set;

import com.project.lmspringpetclinic.model.Speciality;
import com.project.lmspringpetclinic.services.SpecialitiesService;

public class SpecialityServiceMap extends AbstractMapService<Speciality> implements SpecialitiesService {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}
	
	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Speciality save(Speciality object) {
		return super.save(object);		
	}
	
	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
}