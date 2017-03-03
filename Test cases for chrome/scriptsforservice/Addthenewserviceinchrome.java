package productserviceforservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addthenewserviceinchrome {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4444/Product-Services/newService");
		driver.findElement(By.xpath(".//*[@id='service_id']"));
		driver.findElement(By.xpath(".//*[@id='service_name']"));
		driver.findElement(By.xpath(".//*[@id='service']/table/tbody/tr[4]/td/input")).click();
		Thread.sleep(3500);

	}

}
