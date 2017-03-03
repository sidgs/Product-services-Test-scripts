package productserviceforproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addthenewprovidertothelistinchrome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4444/Product-Services/provider");
		driver.findElement(By.xpath("html/body/div/h3/a")).click();
		Thread.sleep(3500);
		
		

	}

}
