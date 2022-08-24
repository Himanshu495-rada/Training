package excelHandling;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.testng.annotations.AfterTest;

public class readExcel {
	
	File f;
	FileInputStream fis;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow rw;
	HSSFCell cl;
	String fpath = "C:\\Users\\himan\\eclipse-workspace\\SeleniumTraining\\excel Folder\\hello.xls";
	int rCount, cCount;
	
  @Test
  public void f() {
	  for(int i = 0; i < rCount; i++) {
		  rw = sh.getRow(i);
		  for(int j=0; j < cCount; j++) {
			  cl = rw.getCell(j);
			  System.out.print(cl.getStringCellValue()+ " ");
		  }
		  System.out.println("");
	  }
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  f = new File(fpath);
	  fis = new FileInputStream(f);
	  wb = new HSSFWorkbook(fis);
	  
	  sh = wb.getSheet("Hello");
	  rCount = sh.getPhysicalNumberOfRows();
	  cCount = sh.getRow(0).getPhysicalNumberOfCells();
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();
	  System.out.println("Done...");
  }

}
