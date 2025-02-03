
package Steps;

import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Steps {

    Login login=new Login();


    @Given("user navigate to automation web")
    public void user_navigate_to_automation_web(){
        login.openbrowser();
    }


    @When("user click on Signup or Login button")
    public void user_click_on_Signup_or_Login_button() throws InterruptedException {
        login.SignUp_Login_button().click();
    }


    @And("user Enter email address {string}")
    public void user_Enter_email_address(String email) throws InterruptedException {
        login.Name().sendKeys(email);
    }
    @And("user Enter password{string}")
    public void user_Enter_password(String password) throws InterruptedException {
        login.pass().sendKeys(password);
    }
    @And("user click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        login.Login_button().click();
    }


    @Then("web will show error message")
    public void web_will_show_error_message() throws InterruptedException {
        String Expected="Your email or password is incorrect!";
        String Actual=login.Actual().getText();
        Assert.assertEquals(Actual,Expected);
    }



}





















