package productserviceformember;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addingnewmwmber {

	public static void main(String[] args) throws Exception {
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:4444/Product-Services/member");
		
		driver.findElement(By.xpath("html/body/div/h3/a")).click();
		
        driver.findElement(By.xpath(".//*[@id='id']"));
		
		driver.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("shylaja");
		
		driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("kamineni");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("vani2692@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='gender']")).sendKeys("female");
		
		driver.findElement(By.xpath(".//*[@id='tele_phone']")).sendKeys("2032960281");
		
		driver.findElement(By.xpath(".//*[@id='userid']")).sendKeys("skamineni");
		
		driver.findElement(By.xpath(".//*[@id='member']/table/tbody/tr[9]/td/input")).click();
	    
	    Thread.sleep(3500);

	}

}
