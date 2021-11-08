package com.sonataQuestion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public  class CComparable {
	
	public static void main(String arg[]) {
		List<Student> n1 = new ArrayList<>();
		n1.add(new Student(107,"Sush",16));
		n1.add(new Student(106,"Josy",22));
		n1.add(new Student(177,"Rakesh",20));
		
		

		Comparator<Student> n = (i,j) -> i.stdMarks<j.stdMarks?1:-1;
		
		Collections.sort(n1,n);
		for(Student s : n1) {
			System.out.println(s.stdId + " " + s.stdName + " " + s.stdMarks);
		}
	}

}
