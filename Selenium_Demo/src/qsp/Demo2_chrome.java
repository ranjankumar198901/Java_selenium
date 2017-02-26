package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo2_chrome
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https:\\www.google.com");
		
		Driver.quit();
	}
}
