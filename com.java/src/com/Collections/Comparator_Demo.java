package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2{
	int id;
	String name;
	int age;
	public Student2(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

//class NameComparator implements Comparator<Student>{
//	public int compare(Student s1,Student s2) {
//		return s1.name.compareTo(s2.name);
//	}
//}
//class IdComparator implements Comparator<Student>{
//	public int compare(Student s1,Student s2) {
//		return s1.id-s2.id;
//	}
//}
class AgeComparator implements Comparator<Student2>{
	public int compare(Student2 s1,Student2 s2) {
		return s1.age-s2.age;
	}
}

public class Comparator_Demo {

	public static void main(String[] args) {
		List<Student2> student=new ArrayList<>();
		
		student.add(new Student2(101,"Likith",23));
		student.add(new Student2(102,"Phani",23));
		student.add(new Student2(103,"Rahul",22));
		student.add(new Student2(104,"Rohit",24));
		student.add(new Student2(105,"Chandu",24));
		
//		Collections.sort(student,new NameComparator());
//		Collections.sort(student,new IdComparator());
		Collections.sort(student,new AgeComparator());
		
		for(Student2 s:student) {
			System.out.println(s);
		}
	}

} 
