import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class findElements11 {

	
	// multiple web elements count 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		//to wait for the page to load--it'ds dynamic in nature, if page is loaded in 10 second then it moves ahead .
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		// get the total count of links on the page
		//get the text of each links
		//list is imported from java
		//webElement is class available in selenium
		
		//l object will have all methods as we have for array list
		//l.size()
		//l.get(i).getText();
		List <WebElement> l= driver.findElements(By.tagName("a"));//with findelemts we donot use sendkeys or click 
		System.out.println(l.size());
		
		List <WebElement> input_count= driver.findElements(By.tagName("input"));
		System.out.println(input_count.size());
		
		//print the text of links
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
       
		
	}

}
