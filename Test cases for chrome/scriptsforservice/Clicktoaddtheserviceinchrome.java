package productserviceforservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicktoaddtheserviceinchrome {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4444/Product-Services/service");
		driver.findElement(By.xpath("html/body/div/h3/a")).click();
		Thread.sleep(3500);

	}

}
