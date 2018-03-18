package com.anthony.dp.observer;

import java.util.Vector;

public class Teacher implements Subject {

	private String phone;
	@SuppressWarnings("rawtypes")
	private Vector students;

	@SuppressWarnings("rawtypes")
	public Teacher() {
		phone = "";
		students = new Vector();
	}

	@SuppressWarnings("unchecked")
	public void attach(Observer o) {
		students.add(o);

	}

	@Override
	public void detach(Observer o) {
		students.remove(o);

	}

	@Override
	public void notice() {
		for (int i = 0; i < students.size(); i++) {
			((Observer) students.get(i)).update();
		}

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		notice();  
	}

	@SuppressWarnings("rawtypes")
	public Vector getStudents() {
		return students;
	}

	@SuppressWarnings("rawtypes")
	public void setStudents(Vector students) {
		this.students = students;
	}

}
