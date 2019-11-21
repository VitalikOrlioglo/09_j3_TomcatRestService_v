package de.cimdata.restapp.service;

import java.util.ArrayList;
import java.util.List;

import de.cimdata.restapp.model.Animal;

public class AnimalService {
	public List<Animal> findAll() {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Dog", "Mammal", false));
		animals.add(new Animal("Cat", "Mammal", false));
		animals.add(new Animal("Duck", "Bird", true));
		animals.add(new Animal("Carp", "Fish", false));
		
		
		
		return animals;
	}
}
