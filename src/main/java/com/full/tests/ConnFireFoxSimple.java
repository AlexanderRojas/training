package com.full.tests;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ConnFireFoxSimple {
	
	private static WebDriver driver;
	
	@Test
	public void function(){
		
		driver = new FirefoxDriver();

		driver.get("https://www.google.com.co/");
	}
}
