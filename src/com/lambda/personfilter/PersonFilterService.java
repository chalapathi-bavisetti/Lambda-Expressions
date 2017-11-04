package com.lambda.personfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonFilterService {

	private List<Person>	personList;
	private	List<Person>	resultList;
	
	public void init() {
		personList = Person.personList();
		resultList = new ArrayList<Person>();
	}	
	public void filterPerson() {
	    
		init();
		Predicate<Person> below16 = p -> p.getAge() >= 16;
	    Predicate<Person> middleMale = p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == 'M';
	    Predicate<Person> senior = p -> p.getAge() >= 23 && p.getAge() <= 65;
	    Predicate<Person> female = p-> p.getGender() == 'F';
	
	    resultList = filterUsingPredicate(below16, personList);
	    
	    System.out.println("Filtered Person : " + resultList);
	    
	}
	
	private static List<Person>  filterUsingPredicate(Predicate predicate, List<Person> personList) {
		
		List<Person>	filteredPersonList = new ArrayList<Person>();
				filteredPersonList = (List<Person>) personList.stream().filter(predicate).collect(Collectors.toList());
		return filteredPersonList;
	}

}
