package productservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Checkwithdifferentpasswordandcorrectusername {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4444/Product-Services/login");
		driver.findElement(By.name("username")).sendKeys("tago");
		driver.findElement(By.name("password")).sendKeys("tagore12");
		Actions a = new Actions(driver);
		WebElement mou = driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[3]/td[2]/input"));
		a.moveToElement(mou).click().build().perform();
		driver.close();
		Thread.sleep(3500);

	}

}
