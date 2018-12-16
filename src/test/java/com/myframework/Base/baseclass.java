package com.myframework.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.myframework.utilities.StartupInitialize;
import com.myframework.utilities.readProperties;





public class baseclass {
	WebDriver driver;
	
	
	@BeforeTest
	@Parameters({"browser","env"})

	public void init(String browser,String env ) {
		StartupInitialize initilize = new StartupInitialize();
		readProperties readProp = new readProperties();		
		initilize.setEnv(env); 
		System.out.println(initilize.getEnv());
		
		switch(browser){		
		case "chrome" : 			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();			
			break;			
			
		case "firefox" :
			System.setProperty("webdriver.chrome.driver", "F:/Auto/Driver/chromedriver_win32/chromedriver.exe");
			driver = new FirefoxDriver();
			break;
			
		default :
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();		
		}	
				
		initilize.setDriver(driver);		
		driver.manage().window().maximize();
		driver.get(readProp.getProperties("url"));
		
	}
	
	
	@AfterTest
	public void cleanup() {
		driver.close();
		
	}

	

}
