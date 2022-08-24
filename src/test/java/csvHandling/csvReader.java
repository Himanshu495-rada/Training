package csvHandling;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class csvReader {
	
	WebDriver driver;
	CSVReader reader;
	String fpath = "C:\\Users\\himan\\eclipse-workspace\\SeleniumTraining\\excel Folder\\data.csv";
	String values[];
	
@SuppressWarnings("deprecation")
@BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  reader = new CSVReader(new FileReader(fpath));
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  System.out.println(driver.findElement(By.id("div_login_error")).getText());
  }

@Test
public void f() throws CsvValidationException, IOException {
	while((values=reader.readNext())!= null) {
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("login1")).sendKeys(values[0]);
		driver.findElement(By.id("password")).sendKeys(values[1]);
		driver.findElement(By.name("proceed")).click();
		System.out.println(driver.findElement(By.id("div_login_error")).getText());
	}
}
 
  @AfterTest
  public void afterTest() throws IOException {
	  reader.close();
	  driver.quit();
  }
  

}
