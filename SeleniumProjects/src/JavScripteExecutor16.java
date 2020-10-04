import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavScripteExecutor16 {

	public static void main(String[] args) throws InterruptedException {
		
		//if DOM is too complex and id is so dynamic and we want to highlight we use JavScriptExecutor
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.freecrm.com/");
		
		//to wait for the page to load--it'ds dynamic in nature, if page is loaded in 10 second then it moves ahead .
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//another wait--it is also dynamic wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("ritu");
		driver.findElement(By.name("password")).sendKeys("test");
		
		// to highlight the webelement
		//driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
		
		//JavascriptExecutor is the class --driver is typecasted to JavascriptExecutor 
		//by help of object we call a method executeScript() which changes the color of element we want to highlight
		//there is no defined method to do this, we have to create our own method and run a loop
		
		

	}

}
