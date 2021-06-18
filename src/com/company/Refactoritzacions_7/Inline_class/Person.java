package com.company.Refactoritzacions_7.Inline_class;

import java.util.Date;


public class Person {

	private String name;
	private Date birth;
	private int genderCode;
	
	public Person(String name, Date birth, int genderCode) {
		this.name = name;
		this.birth = birth;
		this.genderCode = genderCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getGender() {
		return genderCode;
	}

	public void setGender(int gender) {
		this.genderCode = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + genderCode + "]";
	}
	
}
