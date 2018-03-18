package com.anthony.dp.proxy.test;

import java.util.Arrays;

import com.anthony.dp.proxy.dynamicproxy.Subject;

public class TestDynamicProxy {

	/*public static void main(String[] args) {
		
		RealSubjectProxy proxy = new RealSubjectProxy();
		
		
		RealSubject realSubject = new RealSubject();
		
		Subject subject = (Subject) proxy.bind(realSubject);
		subject.doSomenthing();
		
		

	}*/
	
	static Boolean foo(char c){
		System.out.print(c);
		return true;
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		/*int i = 0;
		for(foo('A');foo('B') && (i<2);foo('C')){
			i++;
			foo('D');
		}*/
		
		/*int[] a = {1,2,7,3,4};
		Arrays.sort(a);
		//System.out.println(a);
		
		for(int i = 0;i<a.length;i++)
			System.out.println(a[i] + " ");
		switch (j) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("3");
			break;
		}
	}
	
	static int j = 1;*/

		int[] a = {1,2,7,3,4};
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i] + " ");
		
		System.out.println(Subject.class);
	}
}
