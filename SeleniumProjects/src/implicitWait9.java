import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait9 {

	public static void main(String[] args) {

      //Thread.sleep is a static wait
	 //dynamic wait --how to handle--implicit wait
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("");
		
		//to wait for the page to load--it'ds dynamic in nature, if page is loaded in 10 second then it moves ahead .
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//another wait--it is also dynamic wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

	}

}
