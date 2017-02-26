package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Demo4
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		testbrowser(Driver);
		
		//System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		//WebDriver Driver = new ChromeDriver();
		//testbrowser(Driver);
			
		
	}
	
	public static void testbrowser(WebDriver Driver)
	{
		Driver.manage().deleteAllCookies();
		Driver.get("https:\\www.google.com");
		
		 String url = Driver.getCurrentUrl();
		System.out.println(url);
		
		String title = Driver.getTitle();
		System.out.println(title);
		
		String src = Driver.getPageSource();
		System.out.println(src);
		
		Driver.quit();
	
	}
	
}
