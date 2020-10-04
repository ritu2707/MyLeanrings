import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLDriverConcept15 {

	public static void main(String[] args) throws InterruptedException {

	        //HTMLUnitDriver is not available in Selenium 3.x versions
		    //it's JAR file needs to be downloaded separately.
		    // advantages-
		    // it is fast, we donot see anything it happens in background without opening any browser.
		    //but it doesnot support action class 
		    //headless browser--for java --HtmlUnitDriver, for javascript-phantom.
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			//WebDriver driver= new HtmlUnitDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get("https://ui.freecrm.com/");
			
			//to wait for the page to load--it'ds dynamic in nature, if page is loaded in 10 second then it moves ahead .
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			//another wait--it is also dynamic wait
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			System.out.println("before logging "+ driver.getTitle());
			Thread.sleep(5000);
			driver.findElement(By.name("email")).sendKeys("ritu");
			driver.findElement(By.name("password")).sendKeys("test");
			driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
			System.out.println("after logging "+ driver.getTitle());
			

		}
}
