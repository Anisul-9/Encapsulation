package com.jsp.Encapsulation;

public class Student {

	private int id;
	private String name;
	private String email;
	private long cno;

	public int getId() {
		return id;
	}
	public void setId(int id)
	{
		if (id > 0) {
			this.id = id;
			System.out.println(id);}
		
		else {
			
			System.out.println("id is not valid");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

}