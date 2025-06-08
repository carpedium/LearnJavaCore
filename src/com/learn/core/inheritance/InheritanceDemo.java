package com.learn.core.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		Parent p=new Parent();
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		
		System.out.println("\n--------- Scenario 1 ---------\n");
		// Simple classes referring to their own object types
		p.display();  // Parent Class
		c1.display(); // Child1 class
		c2.display(); // Child2 class

		System.out.println("\n--------- Scenario 2 ---------\n");
		
		// Parent Reference, referring to Child Objects
		
		Parent cp1=new Child1();
		Parent cp2=new Child2();
		
		
		cp1.display(); // Child1 class
		cp2.display(); // Child2 class
		
		System.out.println("\n--------- Scenario 3 ---------\n");

		// using Scenario 2, for runTime Polymorphism.
		
		callChildDisplay(c1); 
		callChildDisplay(c2);
		
	}

	//?? what type of argument here, will work for both the childClasses
	public static void callChildDisplay(Parent p) { 
		// p = c1 = new Child1() || // p = c2 = new Child2() based on method call.
		
		p.display();
	}
}

class Parent {
	public void display() {
		System.out.println("Parent Class");
	}

}

class Child1 extends Parent {
	public void display() {
		System.out.println("Child1 Class");
	}
}

class Child2 extends Parent {
	public void display() {
		System.out.println("Child2 Class");
	}
}
