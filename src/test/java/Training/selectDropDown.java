package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://echoecho.com/tooldropdown.htm");
		
		
		Select dd = new Select(driver.findElement(By.name("choice")));
		
		List<WebElement> lst = dd.getOptions();
		
		for(WebElement w: lst) {
			System.out.println(w.getText());
		}
		
		dd.selectByVisibleText("HOTBOT");
		
		driver.findElement(By.xpath("//input[@value=\"GO!\"]")).click();
		
	}

}
