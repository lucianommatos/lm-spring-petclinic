package com.project.lmspringpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.lmspringpetclinic.model.Owner;
import com.project.lmspringpetclinic.model.PetType;
import com.project.lmspringpetclinic.model.Vet;
import com.project.lmspringpetclinic.services.OwnerService;
import com.project.lmspringpetclinic.services.PetTypeService;
import com.project.lmspringpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		PetType dog = new PetType();
		dog.setName("Doggito");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Kittie");
		PetType savedCatPetType = petTypeService.save(cat);
		
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Luciano");
		owner1.setLastName("Matos");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Thais");
		owner2.setLastName("Albiero");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("John");
		vet1.setLastName("Thompson");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Ciara");
		vet2.setLastName("Doyle");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		
	}

}
