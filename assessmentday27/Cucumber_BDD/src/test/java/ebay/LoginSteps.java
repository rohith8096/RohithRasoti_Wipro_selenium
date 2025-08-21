package ebay;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    WebDriver driver;

    @Given("the eBay login page is open in default browser")
    public void the_ebay_login_page_is_open_in_default_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://signin.ebay.com/");
    }

    @When("^user enters (.*)$")
    public void user_enters_username(String email) {
        driver.findElement(By.id("userid")).click();
        driver.findElement(By.id("userid")).sendKeys(email);
    }

    @When("clicks continue button")
    public void clicks_continue_button() {
        driver.findElement(By.id("signin-continue-btn")).click();
    }

    @When("^enters (.*)$")
    public void enters_password(String password) {
        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @When("clicks on signin button")
    public void clicks_on_signin_button() {
        driver.findElement(By.id("sgnBt")).click();
    }

    @Then("^login should (.*)$")
    public void login_should_status(String status) {
        System.out.println("Status of Test: " + status);
      driver.quit();
    }
}
