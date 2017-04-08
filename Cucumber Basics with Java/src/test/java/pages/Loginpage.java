package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by vens on 3/22/2017.
 */
public class Loginpage {

    public Loginpage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.NAME,using="UserName")
    public WebElement txtUserName;

    @FindBy(how= How.NAME,using="Password")
    public WebElement txtPassword;

    @FindBy(how= How.NAME,using="Login")
    public WebElement btnLogin;

    public void Login (String useName, String password){
        txtUserName.sendKeys(useName);
        txtPassword.sendKeys(password);
    }
    public void ClickLogin(){
        btnLogin.submit();
    }

}