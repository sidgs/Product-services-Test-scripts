package productserviceforproviders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettheserviceproviderlistinchrome {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://localhost:4444/Product-Services/provider");
		Thread.sleep(3500);
		

	}

}
