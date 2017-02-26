package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo7 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.getWindowHandles();
		driver.get("file:///E:/Java_selenium/demo1.html");
		
		WebElement e = driver.findElement(By.tagName("a"));
		e.click();
		
		//optimized code
		driver.findElement(By.tagName("a"));
		
		Demo7.quit(driver);
	}

	private static void quit(WebDriver driver)
	{
	    
		try { 
	        if (driver != null) { 
	            driver.quit(); 
	        } 
	    } catch (Exception e) { 
	        System.out.println(e.getMessage()); 
	    }
	    driver = null;
	}
}
