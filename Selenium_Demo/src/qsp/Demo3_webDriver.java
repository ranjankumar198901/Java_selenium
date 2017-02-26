package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo3_webDriver
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver","./Software/IEDriverServer.exe");
		WebDriver Driver = new InternetExplorerDriver();
		
		Driver.quit();
	}
	
}
