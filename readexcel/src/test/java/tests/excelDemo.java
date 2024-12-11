package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class excelDemo {

	public static void main(String[] args) throws FilloException {

		WebDriver driver;
		String driverpath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverpath + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();

		String excelPath = "C:/Users/byerane/eclipse-workspace/testData/testdata.xlsx";
		System.out.println(excelPath);

		Fillo fillo = new Fillo();
		Connection conn = fillo.getConnection(excelPath);

		String strSelectQuerry = "Select * from Country";
		System.out.println(strSelectQuerry);

		Recordset recordset = conn.executeQuery(strSelectQuerry);

		while (recordset.next()) {
			System.out.println("Column3 =" + recordset.getField("Email"));
			String emailid = recordset.getField("Email");

			driver.findElement(By.xpath("//input[@name='email']")).clear();
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailid);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			System.out.println("Column4 = " + recordset.getField("Password"));
			String passwd = recordset.getField("Password");

			driver.findElement(By.xpath("//input[@name='password']")).clear();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwd);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

			driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();

			WebDriverWait wait = new WebDriverWait(driver, 30);

		}

		recordset.close();
		conn.close();

		System.out.println("/--------------------------------/");

		Connection conn1 = fillo.getConnection(excelPath);

		String strUpdateQuerry = "Update Country set newVal = 'new1'";

		System.out.println(strUpdateQuerry);
		conn1.executeUpdate(strUpdateQuerry);

		System.out.println("Column7 value after Update clause = " + recordset.getField("Update"));
		
		conn1.close();
		
		System.out.println("/--------------------------------/");
		
		Connection conn2 = fillo.getConnection(excelPath);
		System.out.println("Column5 and column6 value before insert clause =" 
					+recordset.getField("firstname") +recordset.getField("lastname"));   
		String strInsertQuerry = "INSERT INTO Country (firstname,lastname) Values('AB','ND')";
		System.out.println(strInsertQuerry);
		
		conn2.executeUpdate(strInsertQuerry);
		System.out.println("Column5 and column6 value after insert clause = "
				+recordset.getField("firstname") +recordset.getField("lastname"));
		
		driver.quit();
	}
}
