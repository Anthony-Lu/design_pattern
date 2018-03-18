package com.anthony.dp.singleton;

/**
 * 枚举
 * 这种方式是Effective Java作者所推荐的方式
 * 它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * @author luxuebing
 * @date 2018/03/18下午8:33:37
 */
public enum Singleton {

	INSTANCE;
}
