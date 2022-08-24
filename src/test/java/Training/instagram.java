package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\Downloads\\Browser Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.instagram.com/direct/inbox/");
		
//		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("himanshuyt20@gmail.com");
//		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("adxpt!@1234");
//		driver.findElement(By.xpath("//*[text()=\"Log In\"]")).click();
//		
//		List<WebElement> lst = driver.findElements(By.xpath("//div[@class = \"_abyk\"]/div/div"));
//		
//		for (WebElement w: lst) {
//			w.click();
//			Thread.sleep(1000);
//		}
	}

}
