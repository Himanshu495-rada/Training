package factoryClass;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class pageTest {
	WebDriver driver;
	pagefactory pf;
  @Test
  public void f() {
	  pf.setUsername("Hello");
	  pf.setPassword("World");
	  pf.keepsignin();
	  pf.login();
	  System.out.println(pf.errormsg.getText());
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  pf = new pagefactory(driver);
	  
	  driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
