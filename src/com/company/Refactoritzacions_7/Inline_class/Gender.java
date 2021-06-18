package com.company.Refactoritzacions_7.Inline_class;

public class Gender {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	public static final int UNDEFINED = 2;
	private int gender;

	public Gender(int gender) {
		this.gender = gender;
	}

	public int getSex () {
		return gender;
	}

	@Override
	public String toString() {
		return Integer.toString(gender);
	}
}
