package com.project.lmspringpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.lmspringpetclinic.model.Owner;
import com.project.lmspringpetclinic.model.Vet;
import com.project.lmspringpetclinic.services.OwnerService;
import com.project.lmspringpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Luciano");
		owner1.setLastName("Matos");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Thais");
		owner2.setLastName("Albiero");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("John");
		vet1.setLastName("Thompson");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Ciara");
		vet2.setLastName("Doyle");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		
	}

}
