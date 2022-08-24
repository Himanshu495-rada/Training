package excelHandling;

import org.apache.poi.hssf.usermodel.*;
import org.testng.annotations.*;

import java.io.*;


public class NewTest {
	
	File f;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	String fpath = "C:\\Users\\himan\\eclipse-workspace\\SeleniumTraining\\excel Folder\\hello.xls";
	int r = 0;
	
  @Test(dataProvider = "dp")
  public void f(String cellVal1, String cellVal2) {
	  rw=sh.createRow(r);
	  
	  cl = rw.createCell(0);
	  cl.setCellValue(cellVal1);
	  
	  cl = rw.createCell(1);
	  cl.setCellValue(cellVal2);
	  
	  r += 1;
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  f=new File(fpath);
	  fos=new FileOutputStream(f);
	  wb=new HSSFWorkbook();
	  sh=wb.createSheet("Hello");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fos.close();
	  System.out.println("Done...");
  }
  
  @DataProvider
  public Object[][] dp() {
	  Object[][] data = new Object[5][2];
	  data[0][0] = "A";
	  data[0][1] = "B";
	  
	  data[1][0] = "aa";
	  data[1][1] = "bb";
	  
	  data[2][0] = "cc";
	  data[2][1] = "dd";
	  
	  data[3][0] = "ee";
	  data[3][1] = "ff";
	  
	  data[4][0] = "gg";
	  data[4][1] = "hh";
	  
	  return data;
  }

}
