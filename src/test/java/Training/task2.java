package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://echoecho.com/htmlforms09.htm");
		
//		List<WebElement> cb = driver.findElements(By.xpath("//input[starts-with(@name,\"option\")]"));
//		
//		for(WebElement w: cb) {
//			if(!w.isSelected()) {
//				w.click();
//				System.out.println("Done");
//			}
//		}
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> r_b = driver.findElements(By.xpath("//input[@name=\"group1\"]"));
		List<WebElement> r_b_2 = driver.findElements(By.xpath("//input[@name=\"group2\"]"));
		
		for(WebElement w: r_b) {
			System.out.println("The " + w.getAttribute("value") + " is " + w.isSelected());
		}
		for(WebElement w: r_b_2) {
			System.out.println("The " + w.getAttribute("value") + " is " + w.isSelected());
		}
		
		
	}

}
