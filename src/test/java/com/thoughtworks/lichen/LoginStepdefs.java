package com.thoughtworks.lichen;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by chenli on 3/25/16.
 */
public class LoginStepdefs {
    private WebDriver driver;
    private WebDriverWait wait;

//    @Before
//    public void setUp() throws Exception{
//        System.setProperty("webdriver.chrome.driver","tools/webdriver/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        wait = new WebDriverWait(driver, 3);
//    }

//    @After
//    public void tearDown() throws Exception{
//        driver.close();
//    }

    @Given("^User is on Home Page$")
    public void userIsOnHomePage() throws Throwable {
        System.setProperty("webdriver.chrome.driver","tools/webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 3);
        driver.get("https://www.amazon.cn");
    }

    @When("^User Navigate to Login Page$")
    public void userNavigateToLoginPage() throws Throwable {
        driver.findElement(By.cssSelector("a[data-nav-ref=nav_ya_signin]")).click();

    }

    @And("^User enters UserName and Password$")
    public void userEntersUserNameAndPassword() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
        driver.findElement(By.id("ap_email")).sendKeys("email address");
        driver.findElement(By.id("ap_password")).sendKeys("password");
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Then("^Back to Home Page$")
    public void backToHomePage() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-logo")));
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.cn/?ref_=nav_ya_signin&");
        driver.close();
    }
}
