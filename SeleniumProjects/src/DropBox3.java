import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox3 {

	public static void main(String[] args) {	
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//to select a value from drop down - we have Select class
		Select select_date= new Select(driver.findElement(By.id("day")));
		select_date.selectByVisibleText("27");
		Select select_month =new Select(driver.findElement(By.id("month")));
		select_month.selectByVisibleText("Feb");
		Select select_year= new Select(driver.findElement(By.id("year")));
		select_year.selectByVisibleText("1992");
		
		driver.quit();
		
		
	}

}
