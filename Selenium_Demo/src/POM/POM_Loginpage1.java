package POM;

// run the script page after this 
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_Loginpage1 
{
	@FindBy(xpath="//a")
	private List <WebElement> alllinks;
	
//-----------------------------------------------------------------------	
	public void countlink()
	{
		int count = alllinks.size();
		System.out.println("Link count " + count );
	}
}
