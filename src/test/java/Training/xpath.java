package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		String address = "Nakhate wasti, rahatani, Pune";
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div/div[2]/input")).sendKeys("Himanshu");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("himanshuyt20@gmail.com");
		driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys(address);
		driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys(address);
		driver.findElement(By.xpath("//button[@id='submit']")).sendKeys(Keys.ENTER);
		
		//String msg = driver.findElement(By.xpath("//p[@id=\"name\"]")).getText();
		String msg = driver.findElement(By.id("output")).getText();
		System.out.println(msg);
		driver.quit();
	}

}
