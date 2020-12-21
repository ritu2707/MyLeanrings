import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics1 {
	
	//launch the browser
    // firefox- gecodriver is a class in selenium
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "//C:\\Users\\Hp\\Downloads\\geckodriver-v0.26.0-win64.exe");
		//WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\Hp\\OneDrive\\Documents\\Selenium_automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Google"))
		{
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is wrong");
		}
		
		String latestURL= driver.getCurrentUrl();
		System.out.println(latestURL);
		//System.out.println(driver.getPageSource());
		driver.quit();
		

	}

}
