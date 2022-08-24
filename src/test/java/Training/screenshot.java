package Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		String filePath = "D:\\My Programs\\output.jpg";
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File output = new File(filePath);
		FileUtils.copyFile(f, output);
		
	}

}
