package productserviceforproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Savetheprovidertothelistinchrome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4444/Product-Services/newProvider");
		driver.findElement(By.xpath(".//*[@id='id']")).sendKeys("0");
		driver.findElement(By.xpath(".//*[@id='provider_id']")).sendKeys("12");
		driver.findElement(By.xpath(".//*[@id='provider_name']")).sendKeys("venky");
		driver.findElement(By.xpath(".//*[@id='provider']/table/tbody/tr[5]/td/input")).click();
		Thread.sleep(3500);

	}

}
