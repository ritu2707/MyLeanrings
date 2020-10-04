import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementvisibility17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://register.freecrm.com/register/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//1. is displayed() method----applicable for all webElements--if available or not on the webpage
		Boolean b1= driver.findElement(By.xpath("//button[contains(@class,'ui fluid large blue submit button')]")).isDisplayed();
		System.out.println(b1);
		
		//2. isEnabled()
		Boolean b2= driver.findElement(By.name("terms")).isEnabled();//mainly for buttons 
		System.out.println(b2);
		
	     //check the checkbox 
		driver.findElement(By.name("terms")).click();
		
		//3. isSelected() only for CheckBoxes ,radio button, and drop downs.
		Boolean b3= driver.findElement(By.name("terms")).isSelected();
		System.out.println(b3);
		
		
		
		

	}

}
