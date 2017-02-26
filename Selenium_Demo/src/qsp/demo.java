package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver Driver= new FirefoxDriver();
		
		Driver.get("https://www.google.co.in/?gfe_rd=cr&ei=KricWJz5L7Gl8weZwJXIBg");
		
		//Driver.quit();
		
	}

}
