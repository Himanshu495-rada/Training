package JUnitTesting;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Testing {
	
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("Beforeclass");
	}
	
	@Before
	public void beforeFunction() {
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@Test
	public void test() {
		driver.findElement(By.id("login1")).sendKeys("Hello");
		driver.findElement(By.id("password")).sendKeys("World");
		driver.findElement(By.name("proceed")).click();
		
		String err = driver.findElement(By.id("div_login_error")).getText();
		
		Assert.assertEquals("Temporary error occured[#5001], please try again.", err);
		System.out.println("Test");
	}
	
	@Test
	public void test2() {
		driver.findElement(By.id("login1")).sendKeys("Hello");

		driver.findElement(By.name("proceed")).click();
		
		Alert al = driver.switchTo().alert();
		String error = al.getText();
		al.accept();
		
		Assert.assertEquals("Please enter your password", error);

		System.out.println("Test");
	}

}
