package com.thoughtworks.lichen;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by chenli on 3/25/16.
 */
public class LoginStepdefs {
    public static WebDriver driver;
    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver","tools/webdriver/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws Exception{
        driver.close();
    }

    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws Throwable {
        //driver = new FirefoxDriver();
        driver.get("https://www.amazon.cn");
    }

    @When("^User Navigate to Login Page$")
    public void userNavigateToLoginPage() throws Throwable {
        //driver.findElement(By.linkText("立即登录"));
        driver.findElement(By.xpath("//*[@id=\"rhf-container\"]/div/div[2]/div[1]/a"));
        //driver.findElement(By.cssSelector("a[class=\"action-button\"]"));

    }

    @And("^User enters UserName and Password$")
    public void userEntersUserNameAndPassword() throws Throwable {
        System.out.println("test");
    }

    @Then("^Navigate to Personal Home Page$")
    public void navigateToPersonalHomePage() throws Throwable {
        System.out.println("test");
    }
}
