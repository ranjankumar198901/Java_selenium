package Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "../Selenium_Demo/Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ranjan-pc/login.do");
		
		LoginPage l= new LoginPage(driver);
		l.clicklogin();
		
		
	}
}
