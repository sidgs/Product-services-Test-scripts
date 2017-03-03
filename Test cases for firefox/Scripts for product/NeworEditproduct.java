package productservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NeworEditproduct {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4444/Product-Services/newProduct");
		driver.findElement(By.xpath(".//*[@id='product_name']")).sendKeys("tagore");;
		driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("whitish");;
		driver.findElement(By.xpath(".//*[@id='product_image']")).sendKeys("vytla");;
		driver.findElement(By.xpath(".//*[@id='product_brand']")).sendKeys("sidgs");;
		driver.findElement(By.xpath(".//*[@id='product_style']")).sendKeys("ourown");;
		driver.findElement(By.xpath(".//*[@id='product']/table/tbody/tr[6]/td/input")).click();
		
		driver.close();
		
		Thread.sleep(3500);
		

	}

}
