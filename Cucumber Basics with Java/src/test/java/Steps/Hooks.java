package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vens on 3/11/2017.
 */
public class Hooks extends BaseUtil {

    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void IntializeTest(){
        System.out.println("Opening the browser:Firefox");
        System.setProperty("webdriver.firefox.marionette","D:\\Driver\\geckodriver.exe");
        base.Driver = new FirefoxDriver();

    }
    @After
    public void TearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println(scenario.getName());
        }
            System.out.println("Closing the browser:Mock");
    }
}
