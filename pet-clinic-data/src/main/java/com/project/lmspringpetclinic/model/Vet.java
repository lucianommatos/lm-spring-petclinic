package com.project.lmspringpetclinic.model;

import java.util.Set;

public class Vet extends Person {
	
	private static final long serialVersionUID = -7513611102422546088L;
	
	private Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}

}
