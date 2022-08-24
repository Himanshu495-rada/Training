package Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//input[starts-with(@name, \"name\")]")).sendKeys("Himanshu Tekade");
		driver.findElement(By.xpath("//input[starts-with(@name, \"login\")]")).sendKeys("hello");
		driver.findElement(By.xpath("//input[starts-with(@name, \"passwd\")]")).sendKeys("hello world");
		driver.findElement(By.xpath("//input[starts-with(@name, \"confirm_passwd\")]")).sendKeys("hello world");
		driver.findElement(By.xpath("//input[starts-with(@name, \"altemail\")]")).sendKeys("himanshuyt20@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name, \"mobno\")]")).sendKeys("000000000");
		
		Select dates = new Select(driver.findElement(By.xpath("//table[2]/tbody/tr[22]/td[3]/select[1]")));
		dates.selectByVisibleText("14");
		
		Select months = new Select(driver.findElement(By.xpath("//table[2]/tbody/tr[22]/td[3]/select[2]")));
		months.selectByVisibleText("DEC");
		
		Select years = new Select(driver.findElement(By.xpath("//table[2]/tbody/tr[22]/td[3]/select[3]")));
		years.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[starts-with(@name, \"gender\")]")).click();
		
		Select countries = new Select(driver.findElement(By.xpath("//table[2]/tbody/tr[26]/td[3]/select[1]")));
		countries.selectByVisibleText("India");
		
		Select cities = new Select(driver.findElement(By.xpath("//div[@id=\"div_city\"]/table/tbody/tr/td[3]/select")));
		cities.selectByVisibleText("Pune");
		
		driver.findElement(By.id("Register")).click();
		
	}

}
