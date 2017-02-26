package HandlingMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4PrintAllLinks 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	
	for(int i=0;i < alllinks.size();i++)
	{
		WebElement links = alllinks.get(0);
			String text = links.getText();
				System.out.println(text);
		
			String text1 = links.getCssValue(text);
				System.out.println(text1);
	}
	
	driver.quit();
	
	}
}
