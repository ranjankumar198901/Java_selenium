package HandlingMultipleElement;

import java.awt.print.Printable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3AutoSuggestion
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		
		 driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		 
		 String xp = "//div[@class='sbqs_c']";
		   List<WebElement> aat = driver.findElements(By.xpath(xp));;
		
		   int Len = aat.size();
		   System.out.println(Len);
		   for(int i=0;i < Len;i++)
		   {
			   String text = aat.get(i).getText();
			   System.out.println(text);
		   }
		
		driver.close();
	}
}
