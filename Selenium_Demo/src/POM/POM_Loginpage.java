package POM;

//Run the Login after this as it contains main method to see the result

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Loginpage 
{
	WebDriver driver ;

	@FindBy(name ="username")
	private WebElement username;
	
	@FindBy(name ="pwd")
	private WebElement Password;
	
	@FindBy(id="loginButton")
	private WebElement LoginButton;
	
	public POM_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
//----------------------------------------------------
	public void login(String un,String pw)
	{
		username.sendKeys(un);
		Password.sendKeys(pw);
		LoginButton.click();
	}
	
}
