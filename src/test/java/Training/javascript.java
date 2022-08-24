package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("document.getElementById('login1').value = \"Himanshu\";");
//		js.executeScript("document.getElementById('password').value = 'Him@2000';");
//		js.executeScript("document.getElementsByName('proceed')[0].click();");
		
		driver.findElement(By.name("q")).sendKeys("Python");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		
		
		
		
	}

}
