package com.anthony.dp.proxy.dynamicproxy;

public class RealSubject implements Subject{

	@Override
	public void doSomenthing() {
		System.out.println("do something ......");
	}

}
