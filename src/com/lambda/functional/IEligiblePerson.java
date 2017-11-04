package com.lambda.functional;

import com.lambda.personfilter.Person;

public interface IEligiblePerson<Boolean> {
	boolean	checkEligibility(Person person);
}
