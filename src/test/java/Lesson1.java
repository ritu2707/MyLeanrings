import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lesson1 {
      //selenium 4 is giving option to take screenshot of the individual webElement
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//in Selenium 4-- TakeScreenshotAs interface can be used to typecast the webElement as well in place of driver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\OneDrive\\Documents\\Selenium_automation\\chromedriver.exe");
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://app.hubspot.com/login");
       Thread.sleep(5000);
       
       WebElement email=driver.findElement(By.id("username"));
       File filesrc= email.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(filesrc, new File( "./target/Screenshot/file.png"));
       
       driver.quit();
       
     
       
       
	}

}
