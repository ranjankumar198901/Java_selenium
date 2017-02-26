package HandlingTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3PrintOnlyNum_Table
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Java_selenium/demo4_table.html");
		
		List<WebElement> alltd = driver.findElements(By.xpath("//td"));
		
		int count=0;
		int sum =0;
		for(WebElement td:alltd)
		{
			String txt = td.getText();
			try
			{
				int n = Integer.parseInt(txt);
				//System.out.println(n);
				count++;
				sum= sum + n;
			}
			catch(NumberFormatException e)
			{
				
			}
			
		}
		System.out.println(count);
		System.out.println(sum);
		
	}
}
