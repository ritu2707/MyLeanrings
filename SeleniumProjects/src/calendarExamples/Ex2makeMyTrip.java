package calendarExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2makeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		
		WebElement depart_datepicker= driver.findElement(By.xpath("//input[@id='departure']"));
        Boolean element= depart_datepicker.isDisplayed();
        if(element==true)
        {
        	System.out.println("date is found");
        }
        Thread.sleep(5000);
		String depart_date= "Tuesday, 28 Apr 2020";
		
		selectDate(depart_datepicker,depart_date,driver);
		

	}
	//Utility to select a date 
	public static void selectDate(WebElement datePicker,String date,WebDriver driver)
	{
		JavascriptExecutor js=  ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", datePicker);
		
	}

}
