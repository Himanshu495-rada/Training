package Training;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabChange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode");
		
		driver.findElement(By.xpath("//div[@id=\"social-icons\"]/a/img")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		System.out.println(win2);
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		
		
		driver.close();
	}

}
