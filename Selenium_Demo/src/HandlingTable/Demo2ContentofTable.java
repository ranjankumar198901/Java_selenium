package HandlingTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2ContentofTable
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Java_selenium/demo4_table.html");
		
		List<WebElement> alltd = driver.findElements(By.xpath("//td"));
		
		//using Enhances for loop
		for(WebElement td:alltd)
		{
			System.out.println(td.getText());
		}
		
		//using for loop
		for(int i=0;i< alltd.size();i++)
		{
			
			WebElement td = alltd.get(i);
			String txt = td.getText();
			System.out.println(txt);
		}
	}
}
