package com.anthony.dp.proxy.staticproxy;

public class Tank2 {
	private Tank t ;
	
	
	
	public Tank2(Tank t) {
		super();
		this.t = t;
	}



	public void move() {
		t.move();
		System.out.println("tank2 move");
	}
	
	
}
