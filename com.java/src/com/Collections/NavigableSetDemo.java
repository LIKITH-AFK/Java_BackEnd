package com.Collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		NavigableSet<Integer> n=new TreeSet<>();
		n.add(13);
		n.add(14);
		n.add(30);
		n.add(79);
		n.add(37);
		n.add(44);
		System.out.println(n);
		
		System.out.println(n.ceiling(33));
		System.out.println(n.floor(30));
		System.out.println(n.lower(30));
		System.out.println(n.higher(37));
//		System.out.println(n.pollFirst());
//		System.out.println(n);
//		System.out.println(n.pollLast());
//		System.out.println(n);
		System.out.println(n.headSet(14,false));
		System.out.println(n.subSet(14, false,44,true));
		System.out.println(n.tailSet(30,false));
	}

}
