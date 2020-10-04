import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamictablesXpath18 {

	//for accessing the tables values 
	//there are two options--1. for loop 
	//2. dynamic XPath creation--by help of parent,precedent-sibling, forward-sibling
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://github.com/login");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.id("login_field")).sendKeys("ritu2707");
		driver.findElement(By.id("password")).sendKeys("Linux@2022");
		//for any element to access in table
		driver.findElement(By.xpath("//a[contains(text(),'selenium code ofr 23rd April')]//parent::td//preceding-sibling::td//span[@class='css-truncate css-truncate-target']")).click();
		
		
		
		
	}

}
