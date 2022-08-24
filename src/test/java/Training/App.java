package Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		String address = "Nakhate wasti, rahatani, Pune";
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Himanshu");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("himanshuyt20@gmail.com");
		driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys(address);
		driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys(address);
		System.out.println("Wait");
		new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.findElement(By.id("submit")).click();
		
	}

}
