package com.learn.core.abstraction;

public class AbstractDemo {
	public static void main(String[] args) {
		
	}
}

/*
 	Abstraction : 

	Its okay for an Abstract class to have no Abstract Method to be declared abstract

	Its okay for an Abstract class with No Abstract Method and only concrete methods
	
	If there is at least 1 abstract method in a class, the class must be declared Abstract.
	
	Abstract Classes cannot be instantiated. 
	possibly because java would not know what to do if abstract method is called on abstract obj
	

	Summarize:
		Any class can be marked Abstract. 
		But if at least 1 method is Abstract, then the class MUST BE marked Abstract

*/

abstract class NoMethodClass {
}

abstract class AbstractParentClass {

	public abstract void doAnything(); // abstract method

	public void disp() {
		// concrete methods
	}
}

/*
 * Abstract Classes can be extended. If the abstract method in parent is not
 * defined in child, the child must also be marked as abstract.
 */

abstract class AbstractChildClass extends AbstractParentClass {
}


/*
 * If abstract method is implemented in child, then, the child becomes a
 * CONCRETE Class, and NOT abstract. everything is well defined.
 */
class GrandChildClassType1 extends AbstractChildClass {

	@Override
	public void doAnything() {
		// this is inherited from AbstractChildClass <- AbstractParentClass, but its Defined now.
		System.out.println("Grand Child Type - 1");
	}
}

