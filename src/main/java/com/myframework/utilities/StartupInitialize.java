package com.myframework.utilities;

import org.openqa.selenium.WebDriver;

public class StartupInitialize {

	private static WebDriver driver;
	private static String Env;
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		StartupInitialize.driver = driver;
	}
	public static String getEnv() {
		return Env;
	}
	public static void setEnv(String env) {
		Env = env;
	}
	
}
