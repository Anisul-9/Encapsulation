package com.jsp.Encapsulation;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(97);
		s1.setName("mustafa zahid");
		s1.setEmail("Mustafa zahid @ gmail.com");
		s1.setCno(345456566);
		
		System.out.println(s1.getName());
		System.out.println(s1.getEmail());
		System.out.println(s1.getCno());
		System.out.println(s1.getId());
		
		Student s2=new Student();
		s2.setId(90);
		System.out.println(s2.getId());
		


		
	}
	
	}
