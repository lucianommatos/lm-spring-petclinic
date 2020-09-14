package com.project.lmspringpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.lmspringpetclinic.model.Owner;
import com.project.lmspringpetclinic.model.Pet;
import com.project.lmspringpetclinic.model.PetType;
import com.project.lmspringpetclinic.model.Speciality;
import com.project.lmspringpetclinic.model.Vet;
import com.project.lmspringpetclinic.services.OwnerService;
import com.project.lmspringpetclinic.services.PetTypeService;
import com.project.lmspringpetclinic.services.SpecialityService;
import com.project.lmspringpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	
	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, 
			SpecialityService specialityService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
	}

	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();
		if (count == 0) {
			System.out.println("Startup Data is empty");
			loadData();
		} else {
			System.out.println("Startup Data is loaded");
		}				
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Doggito");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Kittie");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialityService.save(radiology);
		
		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialityService.save(surgery);
		
		Speciality dentistry = new Speciality();
		dentistry.setDescription("Dentistry");
		Speciality savedDentistry = specialityService.save(dentistry);
		
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Luciano");
		owner1.setLastName("Matos");
		owner1.setAddress("123 Street X");
		owner1.setCity("Wexford");
		owner1.setTelephone("80808080");
		
		Pet lucianosPet = new Pet();
		lucianosPet.setPetType(savedCatPetType);
		lucianosPet.setOwner(owner1);
		lucianosPet.setBirthDate(LocalDate.now());
		lucianosPet.setName("Rita");
		owner1.getPets().add(lucianosPet);
		
		ownerService.save(owner1);		
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Thais");
		owner2.setLastName("Albiero");
		owner2.setAddress("77 Bellefield Springs");
		owner2.setCity("Enniscorthy");
		owner2.setTelephone("909090909");
		
		Pet thaisPet = new Pet();
		thaisPet.setPetType(savedDogPetType);
		thaisPet.setOwner(owner2);
		thaisPet.setBirthDate(LocalDate.now());
		thaisPet.setName("Bento");
		owner2.getPets().add(thaisPet);
		
		ownerService.save(owner2);		
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("John");
		vet1.setLastName("Thompson");
		vet1.getSpecialities().add(savedRadiology);
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Ciara");
		vet2.setLastName("Doyle");
		vet2.getSpecialities().add(savedSurgery);
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
	}

}
