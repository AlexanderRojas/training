package com.full.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id="searchInput")
	private static WebElement searchImput;

	@FindBy(id = "searchLanguage")
	private static WebElement searchLanguage;

	@FindBy(xpath = "//*[@id='search-form']/fieldset/button")
	private static WebElement submitButton;

	public static void go(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

	public static void search(String query, String language) {
		searchImput.sendKeys(query);
		searchLanguage.sendKeys(language);
		submitButton.click();
	}
}
