package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class editpage {
	
	public WebDriver driver;

	public editpage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	// Locators for the page
	public static By editlink = By.xpath("//a[@href='pages/Edit.html']");
	public static By emailIDtxt = By.xpath("//input[@id='email']");
	public static By appendtxt = By.xpath("//input[@value='Append ']");
	public static By defaulttxt = By.name("username");
	public static By cleartxt = By.xpath(("//input[@name='username'])[2]"));
	public static By disablefield = By.xpath("//input[@disabled='true']");

	// Methods

	public void clikeditpglink() {
		driver.findElement(editlink).click();
	}

	public void enterEmail(String text) {
		driver.findElement(emailIDtxt).sendKeys(text);
	}

	public void textAppend(String text1) {
		driver.findElement(appendtxt).sendKeys(text1);
	}

	public String getDefault() {
		return driver.findElement(defaulttxt).getText();
	}

	public void clearfield() {
		driver.findElement(cleartxt).clear();
	}

	public boolean checkfield() {
		return driver.findElement(disablefield).isEnabled();
	}
}
