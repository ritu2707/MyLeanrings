import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame6 {

	
	//browser-> page->frame-> so we need to switch ....
	//if we directly not able to find element in line 17 --we get exception- nosuchelemetexception then it may be in a frame.
	//so add 15 line switch to frame()
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("url");
		driver.switchTo().frame("name/index");
		//then continue with xpath of the button or webelement
		
		driver.findElement(By.xpath("")).click();
		//frame has 2 main attribute name and index.
	}

}
