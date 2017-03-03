package productserviceformember;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getintomemberpage {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:4444/Product-Services/member");
	    
	    Thread.sleep(3500);
		

	}

}
