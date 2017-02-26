package POM;


import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Encapsulation.loginpage2;

public class login
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "../Selenium_Demo/Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ranjan-pc/login.do");
	
		//loginpage2 l2 = new loginpage2(driver);     //
		//l2.login("abc","xyz");
		// here when we call the login method for the first time with invalid username and password it ll reload the page automatically after clicking Login 
		//and when ever the page is reloaded the address of the element changes ,when we call the login method againg it will try to perform action by usign 
		//the old address hence we get SailElementException
		
		loginpage2 l3 = new loginpage2(driver);
		l3.login("admin","manager");
		
		
	
		driver.close();
		
		
	}
}