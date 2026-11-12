package com.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<Integer> s=new TreeSet<>();
		s.add(13);
		s.add(14);
		s.add(3);
		s.add(43);
		s.add(45);
		s.add(33);
		s.add(18);
		System.out.println(s.headSet(40));
		System.out.println(s.tailSet(12));
		System.out.println(s);
		
	}

}
