package com.lambda.functional;

import com.lambda.personfilter.Person;

public class EligiblePersonImpl {

	public static void main(String [] args) {
		
		Person person1 = Person.personList().get(1);
		IEligiblePerson<Boolean> check = (person)-> String.valueOf(person.getGender()).equals('M');
		System.out.println(check.checkEligibility(person1));
	}

}
