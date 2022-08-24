package Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		
//		WebElement element = driver.findElement(By.xpath("//input[@name=\"remember\"]"));
//		if(element.isDisplayed()) {
//			if (element.isEnabled()) {
//				if(element.isSelected()) {
//					element.click();
//					System.out.println("Done");
//				}else {
//					System.out.println("Already unchecked");
//				}
//			}else {
//				System.out.println("Element is not enabled");
//			}
//		}else {
//			System.out.println("Element is not displayed");
//		}
		List<WebElement> el = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));
		for (WebElement w: el) {
			System.out.print(w.getText() + " ");
		}
		List<WebElement> el_2 = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td/a"));
		for (WebElement w: el_2) {
			System.out.println(w.getText());
		}
	}

}
