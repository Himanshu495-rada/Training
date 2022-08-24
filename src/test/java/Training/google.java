package Training;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com");
//		//driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Himanshu Tekade");
//		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//*[contains(text(), \"Videos\")]")).click();
		
		driver.get("http://www.clickwars.us/");
		driver.findElement(By.className("box")).click();
		while(true) {
			try {
				driver.findElement(By.className("box")).click();
			}catch(Exception e) {
				System.out.println(e);
				break;
			}
		}
	}

}
