import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarJavaScript20 {

	public static void main(String[] args) throws InterruptedException {
		//we can use JavaScript Executor to select a date 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement datepicker= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		
		String date= "01/05";//mm-dd-yy
		Thread.sleep(5000);
		selectDate(datepicker,date,driver);
		
	}
	
	//Utility to select a date 
	public static void selectDate(WebElement datepicker,String date,WebDriver driver)
	{
		JavascriptExecutor js=  ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"')", datepicker);
		
	}

}
