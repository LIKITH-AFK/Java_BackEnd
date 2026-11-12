package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Student s) {
		return this.age-s.age;
	}
	
}


public class Comparable_demo {

	public static void main(String[] args) {
		List<Student> student=new ArrayList<>();
		student.add(new Student(101,"Likith",23));
		student.add(new Student(102,"Phani",23));
		student.add(new Student(103,"Rahul",22));
		student.add(new Student(104,"Rohit",24));
		student.add(new Student(105,"Chandu",24));
		
		Collections.sort(student);
		
		for(Student s:student) {
			System.out.println(s);
		}
	}

}
