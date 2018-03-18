package com.anthony.dp.strategy;

public class CompareHelper implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}else if(o1.getAge() < o2.getAge()) {
			return -1;
		}
		return 0;
	}
}
