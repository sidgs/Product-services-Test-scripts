package productservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickviewtoproductpage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4444/Product-Services/login");
		driver.get("http://localhost:4444/Product-Services/login");
		driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[1]/td[2]/input")).sendKeys("tagore");
		driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[2]/td[2]/input")).sendKeys("tagore123");
        driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[3]/td[2]/input")).sendKeys("Submit");
		driver.findElement(By.xpath("html/body/h3/a")).click();
		Thread.sleep(3500);
		

	}

}
