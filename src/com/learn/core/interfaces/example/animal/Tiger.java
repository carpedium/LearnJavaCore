package com.learn.core.interfaces.example.animal;

public class Tiger  implements Animal, CarnivoreAnimal, WildAnimal {
	String name;
	
	public Tiger(String name) {
		this.name=name;
	}
	
	@Override
	public String attackMethod() {
		return "Tiger: Claws + Teeth";
	}

	@Override
	public String huntingMethod() {
		return "Tiger: Group";
	}

	@Override
	public String makeSound() {
		return "Tiger: Roar";	
	}
}
