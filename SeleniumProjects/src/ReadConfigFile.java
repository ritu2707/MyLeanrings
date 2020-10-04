import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadConfigFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		//in Java we have a class Properties which can help to read properties file
		//properties file are simple notepad file where we can save common values throughout testing
		//like--URL, browser ,environment variables,user id ,passwords.
		
		Properties prop= new Properties();
		
		//fileInputStream class helps to connect the java code with the properties file
		//it needs the path of properties file as argument
		FileInputStream ip= new FileInputStream("C:\\Users\\Hp\\git\\myLearning\\SeleniumProjects\\src\\config.properties");
		
		prop.load(ip);
		String URL= prop.getProperty("URL");//we need to pass that key which we have saved in properties file
		String Brower= prop.getProperty("Browser");
		
		if(Brower.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		}
		else if(Brower.equals("Firefox"))	
		{
			System.setProperty("", "");
		}
        
		driver.get(URL);
		// we can save XPaths for webElements also from properties file
		//and call it again with help of properties object.
	}

}
