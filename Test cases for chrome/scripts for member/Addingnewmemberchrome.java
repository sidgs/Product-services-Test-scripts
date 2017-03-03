package productserviceformember;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addingnewmemberchrome {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
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
