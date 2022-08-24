package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class dataprovider {
	
  WebDriver driver;
	
  @Test(dataProvider = "dp", groups="gr1")
  public void f(String u, String p) {
	  driver.findElement(By.id("login1")).sendKeys(u);
	  driver.findElement(By.id("password")).sendKeys(p);
	  driver.findElement(By.name("proceed")).click();
	  String out = driver.findElement(By.id("div_login_error")).getText();
	  String exp = "Wrong username and password combination.";
	  Assert.assertEquals(out, exp);
  }
  
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  driver.findElement(By.id("login1")).clear();
	  driver.findElement(By.id("password")).clear();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Hello", "World" },
      new Object[] { "a", "b" },
      new Object[] { "c", "d" },
      new Object[] { "f", "e" },
      new Object[] { "g", "h" },
    };
  }
  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.quit();
  }


}
