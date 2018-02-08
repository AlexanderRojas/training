package com.full.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.full.pages.HomePage;

public class tests {
	
	WebDriver driver;
	
	@Test
	public void wikipediaSearch(){
		FirefoxOptions firefoxOptions = new FirefoxOptions();
	    firefoxOptions.setCapability("marionette", true);
	    driver = new FirefoxDriver(firefoxOptions);
		PageFactory.initElements(driver, HomePage.class);
		HomePage.go(driver);
		HomePage.search("Cleopatra", "español");
		driver.quit();
	}

}
