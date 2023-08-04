package com.aurionpro.utility;

import com.aurionpro.model.Person;

public class BmiCalculatorDependency {

	public double getBmiScore(Person person)
	{
		
		return person.getWeight()/(person.getHeight()*person.getHeight());
		
	}
	
	public String getBodyCategory(Person person)
	{
		double bmi = getBmiScore(person);
		
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
