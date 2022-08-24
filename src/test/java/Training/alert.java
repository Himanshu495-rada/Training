package Training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		al.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert al2 = driver.switchTo().alert();
		al2.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("promtButton")).click();
		Thread.sleep(1000);
		Alert al3 = driver.switchTo().alert();
		al3.sendKeys("Himanshu");
		al3.accept();
	}

}
