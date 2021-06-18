package com.company.Refactoritzacions_5.Remove_control_flag;


public class Friends {
	private String[] friends;
	
	public Friends (String[] friends) {
		this.friends = friends;
	}
	
	public int indexOf (String friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].equals(friend)) {
				return i;
			}
		}
		return -1;
	}
}
