import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	//1. Alert pop up --handles by Alert() (accept/dismiss)
	//2. File upload pop up-- Browse button/attach button -- driver..find().sendkeys(path of file to be uploaded)
	//3. BrowswerWindow pop up-- by help of getWinodowHandles(); it wil give ids in form of Set<String>  
	//since set does not have index we use Iterator class to get the windows_ids. and not for loop 
	
	
	
	//to handle browser window pop up 
	//we have WindowHandler API of selenium
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.popuptest.com");
		//click onthe button or link which will open another window pop up 
		driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		
		// now we have a method getWindowHandles() it will retrun window id of screen
		Set<String> handler = driver.getWindowHandles();//it wil return set of strings 
		
		//iterate values from set we use Iterator since in set we donot have indexes
		
		Iterator<String> it= handler.iterator();
		String parent_window_id=  it.next();
		System.out.println(parent_window_id);
		String next_window_id= it.next();
		System.out.println(next_window_id);
		
		driver.switchTo().window(next_window_id);
		Thread.sleep(2000);
		
		driver.getTitle();
		
		driver.close();//it will close the current window i.e 2nd pop up window//do not use quit() it will close all windows.
		
		driver.switchTo().window(parent_window_id);
		//to make sure u r on parent window
		driver.getTitle();
		
		
		
		
		

	}

}
