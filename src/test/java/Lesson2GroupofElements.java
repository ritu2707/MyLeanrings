import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lesson2GroupofElements {

	public static void main(String[] args) throws  IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://register.freecrm.com/register/");
	       Thread.sleep(5000);
	       //WebElement formsrc=driver.findElement(By.className("ui form")); multiple class so classname cannot be used
	       WebElement formsrc= driver.findElement(By.cssSelector(".ui.form"));

	    		File filesrc=   formsrc.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(filesrc, new File("./target/Screenshot/group.png"));
	       
	       driver.quit();
	       

	}

}
