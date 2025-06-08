package com.learn.core.interfaces.example.animal;

public interface Animal {	
	public String makeSound();
	
	public default Integer noOfHorns() {
		return 0 ;
	}
}

/* interface can "EXTEND" other interface.. 
 * Multiple interfaces can be extended by an interface
 * All variables of interface are "PUBLIC, STATIC, FINAL" by default.
 * */
interface WildAnimal extends Animal {	
	Integer NO_OF_EYES = 2;
	
	public String attackMethod();	// Horns, Claws, Teeth.
}

interface PetAnimal extends Animal {
	public String startPlaying(); // Jump, Roll
}

interface CarnivoreAnimal extends Animal {
	public String huntingMethod(); // group, solo 
}

interface HerbivoreAnimal extends Animal {
	public String grazeAt(); // grass, trees
}



