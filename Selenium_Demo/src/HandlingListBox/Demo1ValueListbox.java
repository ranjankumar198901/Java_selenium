package HandlingListBox;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1ValueListbox
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Java_selenium/Demo5_Listbox.html");
		
		WebElement listBox = driver.findElement(By.id("MTR"));
		Select select = new Select(listBox);
		
		select.selectByIndex(0);
		select.selectByValue("v");
		select.selectByVisibleText("Dosa");
	}
	

}
