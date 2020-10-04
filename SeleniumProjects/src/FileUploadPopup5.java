import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup5 {

	//to upload file from system is not the part of browser 
	//in this case do not click on the button but use Send key to send the exact file path to attach.
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("url ");
	    driver.findElement(By.xpath("of the browse button")).sendKeys("file path to be uploaded");
	}

}
