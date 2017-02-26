package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage2
{
	private WebElement username,password,LoginButton;
	
	public loginpage2(WebDriver driver)
	{
		username= driver.findElement(By.name("username"));
		password= driver.findElement(By.name("pwd"));
		LoginButton = driver.findElement(By.id("loginButton"));
	}
	
	public void login(String un,String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		LoginButton.click();
		
	}
	
}
