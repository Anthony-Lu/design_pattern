package com.anthony.dp.singleton;

/**
 * 双重校验锁（既保证线程安全，又比普通的懒汉式性能要高）
 * @author luxuebing
 * @date 2018/03/18下午8:36:40
 */
public class DoubleCheck {

	private static DoubleCheck instance = null;
	
	private DoubleCheck(){}
	
	public static DoubleCheck getInstance () {
		
		if(instance == null){
			synchronized (DoubleCheck.class) {
				if(instance == null) {
					instance = new DoubleCheck();
				}
			}
		}
		return instance;
	}
}
