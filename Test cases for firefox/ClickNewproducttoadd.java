package productservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickNewproducttoadd {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:4444/Product-Services/login");
		driver.get("http://localhost:4444/Product-Services/login");
		driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[1]/td[2]/input")).sendKeys("tagore");
		driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[2]/td[2]/input")).sendKeys("tagore123");
		Actions a = new Actions(driver);
        WebElement mou = driver.findElement(By.xpath(".//*[@id='command']/div/table/tbody/tr[3]/td[2]/input"));
        a.moveToElement(mou).click().build().perform();
		driver.findElement(By.xpath("html/body/h3/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/h3/a")).sendKeys("NewProduct");
		Thread.sleep(3500);

	}

}
