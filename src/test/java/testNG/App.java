package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class App {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.navigate().back();
	}
	
	@Test(priority=0)
	public void test1() {
		driver.findElement(By.linkText("About")).click();
	}
	
	@Test(priority=1)
	public void test2() {
		driver.findElement(By.linkText("Advertising")).click();
	}
	
	@Test(priority=2)
	public void test3() {
		driver.findElement(By.linkText("Business")).click();
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
