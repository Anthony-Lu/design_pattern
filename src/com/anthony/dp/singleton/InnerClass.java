package com.anthony.dp.singleton;

/**
 * 静态内部类（既保证延迟加载，又做到了线程安全）
 * @author luxuebing
 * @date 2018/03/18下午8:32:33
 */
public class InnerClass {

	private InnerClass(){}
	
	private static class SingletonHolder{
		private static InnerClass instance = new InnerClass();
	}
	
	public static InnerClass getInstance() {
		return SingletonHolder.instance;
	}
	
}
