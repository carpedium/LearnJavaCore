package com.learn.core.interfaces.example.animal;

public class Lion implements Animal, CarnivoreAnimal, WildAnimal {

	String name ;
	
	public Lion(String name) {
		this.name=name;
	}
	
	@Override
	public String attackMethod() {
		return "Lion: Claws + Teeth";
	}

	@Override
	public String huntingMethod() {
		return "Lion: Group";
	}

	@Override
	public String makeSound() {
		return "Lion: Roar";		
	}
	
}
