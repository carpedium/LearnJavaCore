package com.learn.core.interfaces.example.animal;

public class Bison extends  AbstractAnimal implements HerbivoreAnimal, WildAnimal{

	
	public Bison(String name) {
		this.setName(name);
	}
	
	// Inherited from Animal Interface VIA AbstractAnimal Class
	@Override
	public String makeSound() {
		return "Bison : Moo" ;
	}
	
	// Inherited from Animal Interface VIA AbstractAnimal Class
	@Override
	public Integer noOfHorns() {
		return 2;
	}


	
	// Inherited from Carnivore Interface
	@Override
	public String attackMethod() {
		return "Bison : Horns" ;
	}

	// Inherited from Herbivore Interface
	public String grazeAt() {
		return "Bison : Fields"; 
	}
	
}
