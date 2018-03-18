package com.anthony.dp.singleton;

/**
 * 懒汉式（线程不安全）
 * @author luxuebing
 * @date 2018/03/18下午8:17:13
 */
public class Lazybones {

	private Lazybones(){
		
	}
	private static Lazybones instance = null;
	
	public static Lazybones getInstance() {
		if(instance == null) {
			instance = new Lazybones();
		}
		return instance;
	}
}
