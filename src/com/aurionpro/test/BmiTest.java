package com.aurionpro.test;

import com.aurionpro.model.Person;
import com.aurionpro.utility.BmiCalculator;
import com.aurionpro.utility.BmiCalculatorDependency;

public class BmiTest {

	public static void main(String[] args) {

		Person person = new Person("Anu", 20, 1.7, 40);
		Person person1 = new Person("Anu", 20, 1.7, 40);
		
//		BmiCalculator bmiObj = new BmiCalculator(person);								// Bmi obj tied to one person obj. For passing another person object, we have  
																						// to create another bmi object.
		
		BmiCalculatorDependency bmiDepObj = new BmiCalculatorDependency();				// BmiDep object is not tied to any one person object. 
																						// DEPENDENCY RELATIONSHIP
//		System.out.println("BMI is "+bmiObj.getBmiScore());
//		System.out.println("Body category is "+bmiObj.getBodyCategory());
		
		System.out.println(bmiDepObj.getBmiScore(person));								// THis single BmiDep object can be used to pass diff person objects
		System.out.println(bmiDepObj.getBodyCategory(person));
		
		System.out.println(bmiDepObj.getBmiScore(person1));
		System.out.println(bmiDepObj.getBodyCategory(person1));
	}

}
