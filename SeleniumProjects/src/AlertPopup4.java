import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup4 {

	//handling javaScript alert 
	//Alert is a class-- we hav to use Alert APIs to handle alrert pop up
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//it will click on OK button of the pop pup 
		//alert.dismiss();//to cancel button
		driver.quit();
	    	
	}

}
