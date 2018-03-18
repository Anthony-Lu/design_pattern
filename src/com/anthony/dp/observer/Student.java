package com.anthony.dp.observer;
import com.anthony.dp.observer.Observer;

public class Student implements Observer {

	private String name;
	private String phone;
	private Teacher teacher;

	
	public Student(String name,Teacher t){  
	       this.name = name;  
	       teacher = t;  
	    }  
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	@Override
	public void update() {
		
		phone = teacher.getPhone();

	}

	public void show() {
		
		System.out.println("name=" + name + ",phone=" + phone);
		
	}
}
