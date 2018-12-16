package com.myframework.utilities;


import java.io.File;

import java.io.FileReader;

import java.util.Properties;



public class readProperties {

	//String envFileName;
  

	
	public String getProperties(String key) {
		StartupInitialize initilize = new StartupInitialize();
		Properties prop = new Properties();
		String value = null;
		try {
			String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\" + initilize.getEnv() + ".properties";
			
			//System.out.println(path);
			File f = new File(path);
			FileReader reader = new FileReader(f);
			prop.load(reader);
			//System.out.println(prop.getProperty(key));
			value = prop.getProperty(key);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return value;
	}

}


