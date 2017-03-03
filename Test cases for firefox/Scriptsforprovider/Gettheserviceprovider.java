package productserviceforproviders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettheserviceprovider {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4444/Product-Services/provider");
		Thread.sleep(3500);
		

	}

}
