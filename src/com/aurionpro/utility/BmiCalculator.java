package com.aurionpro.utility;

import com.aurionpro.model.Person;

public class BmiCalculator {																		
	
																						// utility class - contain methods of person class 
																						// only one responsibility for each class
	private Person person;													// Composition

	public BmiCalculator(Person person) {
		super();
		this.person = person;
	}
	
	public double getBmiScore()
	{
		
		return person.getWeight()/(person.getHeight()*person.getHeight());
		
	}
	
	public String getBodyCategory()
	{
		double bmi = getBmiScore();
		
		if(bmi < 18.5)
		{
			return "Under weight";
		}
		else if(bmi  < 25)
		{
			return "Normal weight";
		}
		else if(bmi<39)
		{
			
		}
		
		return "Hii";
	}
	
}
