package propertyHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.*;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class readProperty {
	
	String fpath = "C:\\Users\\himan\\eclipse-workspace\\SeleniumTraining\\RediffLoginElements.properties";
	Properties p;
	File f;
	FileInputStream fis;
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.id(p.getProperty("usernameID"))).sendKeys("Hello");
	  driver.findElement(By.id(p.getProperty("passwordID"))).sendKeys("World");
	  driver.findElement(By.name(p.getProperty("signInBtnName"))).click();
	  
	  System.out.println(driver.findElement(By.id(p.getProperty("errorMsgCSS"))).getText());
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  f = new File(fpath);
	  fis = new FileInputStream(f);
	  p = new Properties();
	  p.load(fis);
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.navigate().to(p.getProperty("url"));
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  

}
