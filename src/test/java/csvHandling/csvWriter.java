package csvHandling;

import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import org.testng.annotations.BeforeTest;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.AfterTest;

public class csvWriter {
	CSVWriter writer;
	String fpath = "C:\\Users\\himan\\eclipse-workspace\\SeleniumTraining\\excel Folder\\writer.csv";
	
  @Test
  public void f() {
	  String[] line1 = {"a", "b"};
	  writer.writeNext(line1);
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  writer = new CSVWriter(new FileWriter(fpath));
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  writer.close();
  }

}
