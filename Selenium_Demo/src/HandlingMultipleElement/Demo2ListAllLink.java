package HandlingMultipleElement;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2ListAllLink 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
				
		driver.get("file:///E:/Java_selenium/Demo3.html");
		
		List<WebElement> alllink = driver.findElements(By.xpath("//a"));
		
		//count 
		 int count = alllink.size();
		 System.out.println(count);
		
		 // text 
		 for(int i=0;i< count;i++)
		 {
			 WebElement link = alllink.get(i);
		 	 String text = link.getText();
		 	 System.out.println(text);
		 }
		
		driver.quit();
		
	}
}
