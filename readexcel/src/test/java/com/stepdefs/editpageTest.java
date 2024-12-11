package com.stepdefs;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.editpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.readExcel;

public class editpageTest {
	
	public static WebDriver driver;
	String driverpath = System.getProperty("user.dir");
	
	editpage editp = new editpage(driver);
	readExcel redex = new readExcel();
	
	@Given("I launch the browser and app url")
	public void i_launch_the_browser_and_app_url() {
		System.setProperty("webdriver.chrome.driver", driverpath+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
	}

	@When("I click the edit link btn")
	public void i_click_the_edit_link_btn() {
	  driver.findElement(By.xpath("//a[@href='pages/Edit.html']")).click();
	  //editp.clikeditpglink();  /**Error in code*/
	}

	@Then("^I enter the text in textbox$")
	public void i_enter_the_text_in_textbox() throws IOException {
		ArrayList<String> al= redex.getExcelData("Email","Email");
		editp.enterEmail(al.get(1));	  
		//editp.textAppend(al.get(1));
	}

	@Then("I quit the browser and application")
	public void i_quit_the_browser_and_application() {
	  driver.quit();
	}
}
