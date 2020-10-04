import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		//1. by Xpath---2
		//absolute Xpath should not be used
		//relative xpath should be preferred
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ritu");
		
		//2.By name - if name is available--4
		driver.findElement(By.name("lastname")).sendKeys("Aparna");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		
		//3.By id- if id is there ---1
		driver.findElement(By.id("day")).isEnabled();
		
		//4.By Link text-- if hyperlink there won't be name ,id just anchro tag
		//driver.findElement(By.linkText("Create a Page")).click();
		
		//5. by partial link text
		// if the hyperlink has a bigger sentence we can use partial link text, it is not recommended.
		
		//6. CSS Selector  --3
		driver.findElement(By.cssSelector("#u_0_w")).sendKeys("345trft@123");
		
		//7.by class name- not recommended as class name can be duplicate for 2 web elemets --5
		driver.close();
		
		

	}

}
