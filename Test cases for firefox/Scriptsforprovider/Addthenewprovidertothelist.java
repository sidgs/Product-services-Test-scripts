package productserviceforproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addthenewprovidertothelist {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4444/Product-Services/provider");
		driver.findElement(By.xpath("html/body/div/h3/a")).click();
		Thread.sleep(3500);
		

	}

}
