package pakagetoPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelreading {
	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\ng\\AUTO\\auto new\\eclipside\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(1000);

	FileInputStream MyFile1=new FileInputStream("E:\\ng\\AUTO\\auto new\\screenshot\\nagpur.xlsx");
	String value1=WorkbookFactory.create(MyFile1).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value1);
	
	

	}}