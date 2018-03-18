package com.anthony.dp.factory;

public class TestFactory {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		try {
			Car car = (Car) carFactory.getBean("name");
			System.out.println(car);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
