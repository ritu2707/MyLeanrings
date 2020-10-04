import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getRectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       WebDriver driver=new ChromeDriver();
	       
	       driver.get("https://www.w3schools.com/");
	       WebElement buttonsize= driver.findElement(By.xpath("//h1[text()='HTML']"));
	       //in selenium 3
	       Dimension ds= buttonsize.getSize();
	       System.out.println(ds.getHeight());
	       System.out.println(ds.getWidth());
	       
	       Point p=buttonsize.getLocation();
	       System.out.println(p.getX());
	       System.out.println(p.getY());
	       System.out.println("****************************");
	       //in selenium 4
	       Rectangle rc=buttonsize.getRect();
	       System.out.println(rc.getHeight());
	       System.out.println(rc.getWidth());
	       System.out.println(rc.getX());
	       System.out.println(rc.getY());
	       System.out.println(rc.getPoint());
	       
	       driver.quit();
	       
		

	}

}
