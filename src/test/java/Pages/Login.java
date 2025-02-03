package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

    WebDriver driver= Hooks.driver;
public void openbrowser(){
    driver.get("https://automationexercise.com/");
}
    public WebElement SignUp_Login_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    }


    public WebElement Name() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    }



    public WebElement pass() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    }


    public WebElement Login_button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
    }



    public WebElement Actual() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//p[@style=\"color: red;\"]"));
    }


}
