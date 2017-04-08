package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import Transformation.SalarycountTransformer;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Loginpage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vens on 3/10/2017.
 */
public class LoginStep extends BaseUtil{

    private BaseUtil Base;

    public LoginStep(BaseUtil base) {
        Base = base;
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        Assert.assertEquals("Its not displayed",Base.Driver.findElement(By.name("initial")).isDisplayed(),true);
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("I navigate to the login page");
        Base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");

    }

    @And("^I enter the username as admin and password as admin$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I enter the username as admin and password as adminpassword");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
       Loginpage page = new Loginpage(Base.Driver);
        page.ClickLogin();
    }

    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        /*List<List<String>> data = table.raw();
        System.out.println("The value is :"+ data.get(0).get(0).toString());
        System.out.println("The value is:"+ data.get(0).get(1).toString());*/
        //Create an Array list
        List<User> users = new ArrayList<User>();
        //store all the users
        users = table.asList(User.class);
        Loginpage page = new Loginpage(Base.Driver);
        for (User user:users) {
            page.Login(user.username,user.password);

        }
    }

    @And("^I enter([^\"]*)and ([^\"]*)$")
    public void iEnterUsernameAndPasswordForLogin(String userName,String password) throws Throwable {
        System.out.println("Username is :"+userName);
        System.out.println("Password is :"+password);
    }

    @And("^I enter the users email address as Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {
       System.out.println("The Email Address is "+email);
    }

    @And("^I verify the count of salary digits for Rs (\\d+)$")
    public void iVerifyTheCountOfSalaryDigitsForRs(@Transform(SalarycountTransformer.class) int salary) throws Throwable {
        System.out.println("My salary digit count is"+ salary);

    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;


    }



        }
    }


