package HandlingTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1_table
{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Java_selenium/demo4_table.html");
			List<WebElement> allTR = driver.findElements(By.tagName("tr"));
			
			
			for(int i=0;i<allTR.size();i++)
			{	
		     WebElement tr = allTR.get(i);
				{
					List<WebElement> allTD = tr.findElements(By.tagName("td"));
					for(int j=0;j<allTD.size();j++)
					{
						String text = allTD.get(j).getText();
						System.out.print(text + " ");
					}
					System.out.println(  );
				}
			}
		driver.quit();
	}
}
