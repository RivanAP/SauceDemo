package step_definitions;

import com.example.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class loginSteps {
    private WebDriver webDriver;

    public loginSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("User open the web page")
    public void verifyLogin (){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed();
    }
    @When("User input \"(.*)\" as username and \"(.*)\" as password")
    public void inputCredential(String user,String pass){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsername(user);
        loginPage.setPassword(pass);
        loginPage.clickLogin();
    }
    @Then ("User will see \"(.*)\" on login page")
    public void ErrorMassage(String ErrorText){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.getErrorMessage();
        assertEquals(ErrorText, loginPage.getErrorMessage());
    }


}