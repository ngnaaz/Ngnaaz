package pakagetoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingcomman {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\ng\\AUTO\\auto new\\eclipside\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//span[text()=' Meta © 2023']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);
	}

}
