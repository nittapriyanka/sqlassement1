package com.sonataQuestion2;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>
{

	int stdId;
	String stdName;
	 int stdMarks;



	public Student(int stdId, String stdName, int i) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdMarks = i;
	}

	public int getStdId() {
		return stdId;
	}



	public void setStdId(int stdId) {
		this.stdId = stdId;
	}



	public String getStdName() {
		return stdName;
	}



	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	public int getStdMarks() {
		return stdMarks;
	}



	public void setStdMarks(int stdMarks) {
		this.stdMarks = stdMarks;
	}
       	
    		
   //@Override
	//public int compareTo(Student s)  {
		
		//return stdMarks<s.stdMarks?1:-1;
	//}

	public static void sort(List<Student> n1, Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
  
}
