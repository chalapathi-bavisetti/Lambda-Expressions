package com.lambda.personfilter;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	
	
	Person(String fname) {
		this.firstName = fname;
	}
	Person(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}
	public Person(String fname, int age) {
		this.firstName = fname;
		this.age = age;
	}
	Person(String fname, String lname, int age) {
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}
	Person(String fname, String lname, int age, char g) {
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
		this.gender = g;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "\nPersons :----------------- "
				+ "\nfirstName=" + firstName + ", "
				+ "\nlastName=" + lastName + ", "
				+ "\nage=" + age + ", "
				+ "\ngender=" + gender;
				
	}
	
	public static List<Person> personList() {
		
		Person person1 = new Person("Phil","Jain",25,'M');
		Person person2 = new Person("Joy","Shah",18,'M');
		Person person3 = new Person("Meera","Rajput",32,'F');
		Person person4 = new Person("Rahul","Kumar",24,'M');
		Person person5 = new Person("Jennifer","Gupta",33,'F');
		
		List<Person>  personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);
		
		return personList;
		
	}
	
}
