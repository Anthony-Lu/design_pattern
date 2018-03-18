package com.anthony.dp.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RealSubjectProxy implements InvocationHandler {

	private Object o;

	public Object bind(Object o) {
		this.o = o;
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before...");
		Object object = method.invoke(o, args);
		System.out.println("after...");
		return object;
	}
}
