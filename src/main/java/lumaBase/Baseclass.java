package lumaBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;
	public static void BrowserLaunch(String url) {
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
	}

}
