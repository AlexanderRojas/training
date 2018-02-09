package com.full.tests;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

//import org.testng.annotations.Parameters;

public class LoginTests {

	private static WebDriver driver;

	@Test

	//@Parameters({ "sUsername", "sPassword" })

	//public void test(String sUsername, String sPassword) {
	public void test() {

		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setCapability("marionette", true);
		driver = new FirefoxDriver(firefoxOptions);

		//driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.google.com.co/");

		/*
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='account']/a")).click();

		driver.findElement(By.id("log")).sendKeys(sUsername);

		driver.findElement(By.id("pwd")).sendKeys(sPassword);

		driver.findElement(By.id("login")).click();

		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
*/
		//driver.quit();

	}

}