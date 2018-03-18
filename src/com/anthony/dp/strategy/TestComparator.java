package com.anthony.dp.strategy;

public class TestComparator {

	public static void main(String[] args) {
		User u1 = new User(1, "zhangsan", "男");
		User u2 = new User(5, "lisi", "男");
		
		int compare = new CompareHelper().compare(u1, u2);
		
		if(compare > 0) {
			System.out.println(u1.getName() + "的年龄" + " > " + u2.getName() + "的年龄");
		}else if(compare < 0){
			System.out.println(u1.getName() + "的年龄" + " < " + u2.getName() + "的年龄");
		}else{
			System.out.println(u1.getName() + "的年龄" + " = " + u2.getName() + "的年龄");
		}
		
	}
}
