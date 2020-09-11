package com.project.lmspringpetclinic.model;

public class PetType extends BaseEntity {

	private static final long serialVersionUID = -5529118288028065736L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

}
