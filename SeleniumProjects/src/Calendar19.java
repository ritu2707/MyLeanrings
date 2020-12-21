import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar19 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://register.freecrm.com/register/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//login
		//save the date want to be selected in form of String array 
		String date="18-Sptember-2020";
		String datearr[]= date.split("-");
		String day= datearr[0];
		String month=datearr[1];
		String year=datearr[2];
		
		//now if months and year are in drop downs use Select Class
		Select s=new Select(driver.findElement(By.xpath("xpath for the drop down")));
		s.selectByVisibleText(month);
		Select s2= new Select(driver.findElement(By.xpath("xpath for the year drop down")));
		s2.selectByVisibleText(year);
		
		//now we have to select date 
		//day is in for of tables
		//use for loop to select a particular date 
		//there will be 2 for loop ,one for rows and another for column
	}

}
