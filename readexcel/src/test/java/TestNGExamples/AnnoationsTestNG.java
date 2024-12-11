package TestNGExamples;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnoationsTestNG {
	
	public WebDriver driver;
	public String url = "https://www.lambdatest.com/";
	
	@BeforeSuite
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("The Setup process is completed");
	}
	
	@BeforeTest
	public void profileSetup()
	{
		driver.manage().window().maximize();
		System.out.println("The Profile Setup is completed");
	}
	
	@BeforeClass
	public void appSetup()
	{
		driver.navigate().to(url);
		System.out.println("The app url setup is completed");
	}

	@BeforeMethod
	public void checklogin()
	{
		//driver.get("https://accounts.lambdatest.com/login");
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		String pagetitle = driver.getTitle();
		Assert.assertEquals(pagetitle, "Login - LambdaTest");
		driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("aabbcc5566@rediffmail.com");
		driver.findElement(By.xpath("//input[@name='password' or @placeholder='password']")).sendKeys("Bhushan@rediff");
		driver.findElement(By.xpath("//button[@id='login-button']")).click();
		System.out.println("The login setup is completed ");
	}
	
	@Test(groups ="urlValidation")
	public void testcurrenturl()
	{
		String pagetitle = driver.getTitle();
		Assert.assertEquals(pagetitle, "Welcome - LambdaTest");
		String pageurl = driver.getCurrentUrl();
		Assert.assertEquals(pageurl, "https://accounts.lambdatest.com/dashboard");
		System.out.println("The url validation test is completed");
	}
	
	@AfterMethod
	public void screenshot() throws IOException
	{
		TakesScreenshot scrn = ((TakesScreenshot)driver);
		File file1 = scrn.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file1, new File("C:\\Users\\byerane\\eclipse-workspace\\readexcel\\Drivers\\test.png"));
		
		System.out.println("The Screen shot of Test taken");
	}
	
	@AfterClass
	public void closeup() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='profile__dropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		
		driver.quit();
		System.out.println("The close_up process is completed");
	}
	
	@AfterTest
	public void reportready()
	{
		System.out.println("Report is ready to be shared, with screenshots of tests");
	}
	
	@AfterSuite
    public void cleanUp()
    {
        System.out.println("All close up activities completed");
    }
    
    @BeforeGroups("urlValidation")
    public void setUpSecurity() {
        System.out.println("url validation test starting");
    }
  
    @AfterGroups("urlValidation")
    public void tearDownSecurity() {
        System.out.println("url validation test finished");
    }
    
}
