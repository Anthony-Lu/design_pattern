package com.anthony.dp.proxy.staticproxy;

public class CarProxy implements Move{

	private Move car;
	
	public CarProxy(Move car) {
		this.car = car;
	}


	@Override
	public void move() {
		System.out.println("befor..");
		
		car.move();
		
		System.out.println("after...");
		
	}

	public Move getCar() {
		return car;
	}

	public void setCar(Move car) {
		this.car = car;
	}
	
}
