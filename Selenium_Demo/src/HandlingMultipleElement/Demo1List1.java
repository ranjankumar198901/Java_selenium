package HandlingMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1List1 
{
	public static void main(String[] args)
	{	
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///E:/Java_selenium/Demo3.html");
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		// to get the count of all the links
		int count = alllinks.size();
		System.out.println(count);
		
		//to get the text of the Link
		WebElement Link = alllinks.get(0);
		String text = Link.getText();
		System.out.println(text);
		
		
	}
}

