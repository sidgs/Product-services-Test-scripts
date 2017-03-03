package productserviceforservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addthenewservice {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4444/Product-Services/newService");
		driver.findElement(By.xpath("//input[@id='service_id'"));
		driver.findElement(By.xpath(".//*[@id='service_name']")).sendKeys("manoj");
		driver.findElement(By.xpath(".//*[@id='service']/table/tbody/tr[4]/td/input")).click();
		Thread.sleep(3500);

	}

}
