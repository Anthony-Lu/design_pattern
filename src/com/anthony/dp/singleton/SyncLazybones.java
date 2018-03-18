package com.anthony.dp.singleton;

/**
 * 懒汉式（线程安全，但是性能较差）
 * @author luxuebing
 * @date 2018/03/18下午8:19:33
 */
public class SyncLazybones {
	
	private SyncLazybones(){
		
	}
	
	private static SyncLazybones instance = null;
	
	public static synchronized SyncLazybones getInstance() {
		if(instance == null) {
			
			instance = new SyncLazybones();
		}
		return instance;
	}
}
