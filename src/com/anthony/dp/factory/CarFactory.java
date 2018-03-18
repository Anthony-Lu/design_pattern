package com.anthony.dp.factory;

import java.io.InputStream;
import java.util.Properties;

public class CarFactory {

	public Object getBean(String name) throws Exception {
		Properties prop = new Properties();
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("com/anthony/dp/factory.properties");
		prop.load(inputStream);
		String className = prop.getProperty(name);
		return Class.forName(className).newInstance();
	}
}
