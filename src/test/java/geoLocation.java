import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class geoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		HashMap<String,Object> cordinates= new HashMap<String,Object>();
		cordinates.put("latitude", 26.121473);
		cordinates.put("longitude", 85.368752);
		cordinates.put("accuracy", 1);
		((ChromeDriver)driver).executeCdpCommand("Emulation.setGeolocationOverride", cordinates);
		driver.get("https://www.google.co.in/maps");
	}

}
