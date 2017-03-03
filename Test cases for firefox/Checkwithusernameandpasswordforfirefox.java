package productservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Checkwithusernameandpasswordforfirefox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4444/Product-Services/login");
		driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[1]/td[2]/input")).sendKeys("tagore");
		driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[2]/td[2]/input")).sendKeys("tagore123");
        Actions a = new Actions(driver);
		WebElement mou = driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[3]/td[2]/input"));
		a.moveToElement(mou).build().perform();
		driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[3]/td[2]/input")).click();
		
	    Thread.sleep(3500);

	}

}
