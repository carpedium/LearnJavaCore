package com.learn.core.interfaces.example.animal;

public class Dog implements PetAnimal {

	@Override
	public String makeSound() {
			return "Dog: Bark" ;
	}

	@Override
	public String startPlaying() {
		return "Dog: Jump + Roll" ;
	}

	
	
}