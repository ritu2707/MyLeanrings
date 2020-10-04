import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement7 {
     
	//mouse action is performed by Actions class
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(5000);
	
		//for mouse action we use Actions class - nd with move to element function--> build().Perform()
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		Thread.sleep(3000);//add wait so that mouse hovering can be done easily
		driver.findElement(By.linkText("Visa Services")).click();//if we do directly click on visa service wil get eerror 
		//elementclickinterceptedexception 
		driver.quit();

	}

}
