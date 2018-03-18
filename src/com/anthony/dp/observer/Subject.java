package com.anthony.dp.observer;

import com.anthony.dp.observer.Observer;

public interface Subject {

	void attach(Observer o);
	void detach(Observer o);
	void notice();
}
