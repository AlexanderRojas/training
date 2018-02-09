package com.full.tests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;


import com.full.pages.HomePage;

public class Tests {
	
	WebDriver driver;
	
	@Test
	public void wikipediaSearch(){
		FirefoxOptions firefoxOptions = new FirefoxOptions();
	    firefoxOptions.setCapability("marionette", true);
	    driver = new FirefoxDriver(firefoxOptions);
		PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HomePage.go(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HomePage.search("Cleopatra", "español");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
	}

}
