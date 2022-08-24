package excelHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class testWebsite {
	
	File f;
	FileInputStream fis;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	String fpath = "C:\\Users\\himan\\eclipse-workspace\\SeleniumTraining\\excel Folder\\hello.xls";
	int rCount, cCount;
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String u, String p) {
	  driver.findElement(By.id("login1")).sendKeys(u);
	  driver.findElement(By.id("password")).sendKeys(p);
	  driver.findElement(By.name("proceed")).click();
	  String out = driver.findElement(By.id("div_login_error")).getText();
	  String exp = "Wrong username and password combination.";
	  Assert.assertEquals(out, exp);
  }
  
  @DataProvider
  public Object[][] dp(){
	  Object[][] data = new Object[rCount-1][cCount];
	  for(int i = 0; i < rCount - 1; i++) {
		  rw = sh.getRow(i+1);
		  for(int j = 0; j < cCount; j++) {
			  data[i][j] = rw.getCell(j).getStringCellValue();
		  }
	  }
	  return data;
  }
  
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  driver.findElement(By.id("login1")).clear();
	  driver.findElement(By.id("password")).clear();
  }
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  f = new File(fpath);
	  fis = new FileInputStream(f);
	  wb = new HSSFWorkbook(fis);
	  
	  sh = wb.getSheet("Hello");
	  rCount = sh.getPhysicalNumberOfRows();
	  cCount = sh.getRow(0).getPhysicalNumberOfCells();
	  System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();
	  System.out.println("Done...");
	  driver.quit();
  }

}
