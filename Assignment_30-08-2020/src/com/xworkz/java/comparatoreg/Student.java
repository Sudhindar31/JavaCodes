package com.xworkz.java.comparatoreg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

	int age;
	String name;
	String address;

	public Student(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(16, "Rohan", "JP Nagar"));
		students.add(new Student(16, "Rahul", "RR Nagar"));
		students.add(new Student(18, "Reka", "Rajaji Nagar"));
		students.add(new Student(14, "Ruhi", "JayaNagar"));
		
		Collections.sort(students);
		
		for (Student s : students) {
			System.out.println(s.toString());
		}

	}

	/*@Override
	public int compareTo(Student o) {
		if (o.age == this.age && o.name.equals(this.name)) {
			return 0;
		} else if (this.age > o.age) {
			return 1;
		} else {
			return -1;
		}

	}*/
	
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);

	}

}
