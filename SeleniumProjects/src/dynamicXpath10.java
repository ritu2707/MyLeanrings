import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath10 {

	//absolute Xpath is the xpath written from parent till the end which can be changed at later point of time
	//disadvantage--
	//1. performance is slow
	//not reliable as it can be chnaged in future
	
	
	//better option is dynamic xpath
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com/");
		
		//to wait for the page to load--it'ds dynamic in nature, if page is loaded in 10 second then it moves ahead .
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//another wait--it is also dynamic wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        //to write customized XPath 
		//1. start with //html tag[]--> then look for the available attributes and add @ attribute='value'
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("Sony TV");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		//2. contains function in dynamic XPath
		// sometime id keeps on changing so we hav to use contains() function
		//  //input[contains()]---() since contains is a function
		//  //input[contains(@class,'LM6RPg')] use comma if u r using contains function as this is argument.
		
		//id-- test_123
		//id--test_456
		//By.Xpath(//input[contains(@id,'test_')])
		
		//3. starts-with function
		//  //input[starts-with(@id,'test_')];
		
		//4. ends-with
		// //input[ends-with(@id,'_test_t')]
		
		// 5. for especially the hyperlink other than By.LinkText and By.partiallinktext
		//-- a is anchor tag(HTML tag) , text is another function so have ()
		// //a[contains(text(), 'My Account')]
		
	}

}
