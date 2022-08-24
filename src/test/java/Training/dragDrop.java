package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.navigate().to("http://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		Actions act=new Actions(driver);
		WebElement smlBox=driver.findElement(By.id("draggable"));
		WebElement bigBox=driver.findElement(By.id("droppable"));
		act.dragAndDrop(smlBox, bigBox).perform();
		driver.switchTo().defaultContent();
		
	}

}
