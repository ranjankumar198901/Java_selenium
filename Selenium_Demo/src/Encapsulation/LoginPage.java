package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage 
{
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		loginButton = driver.findElement(By.id("loginButton"));
	}
	public void clicklogin()
	{
		loginButton.click();
	}
}
