package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Encapsulation.loginpage2;

public class script1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "../Selenium_Demo/Software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://ranjan-pc/login.do");
		
		POM_Loginpage1 l1 = new POM_Loginpage1();
		
		PageFactory.initElements(driver, l1);
		l1.countlink();
		
	}
}
