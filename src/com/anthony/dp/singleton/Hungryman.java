package com.anthony.dp.singleton;

/**
 * 饿汉式(线程安全，但浪费资源)
 * @author luxuebing
 * @date 2018/03/18下午8:21:54
 */
public class Hungryman {

	private Hungryman (){}
	private static Hungryman instance = new Hungryman();
	
	public static Hungryman getInstance() {
		return instance;
	}
			
}
