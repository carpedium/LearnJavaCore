package com.learn.core.interfaces.example.animal;

public class AnimalInterfaceDemo {

	public static void main(String[] args) {

		Bison bison = new Bison("Bison_1");

		System.out.println(
				
				"Animal : " + bison.getName() + 
				"\n horns:" + bison.noOfHorns() + 
				"\n attackMethod:" + bison.attackMethod()
				+ "\ngrazeat: " +bison.grazeAt());
		
		
		Animal a=bison;
		

	}

	public static void displayAnimalSound(Animal a) {
		a.makeSound();

	}

	public static void displayHunt(WildAnimal wa) {

	}
}
