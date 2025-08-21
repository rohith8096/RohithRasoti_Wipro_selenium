package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class eBay_page {
	WebDriver  driver;

@Given("open Ebay website in browser")
public void open_ebay_website_in_browser() {
    driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("login with correct credentials")
public void login_with_correct_credentials() {
eBay_pageclass pg = new eBay_pageclass(driver);
pg.username();
}

@Then("all test cases executed sucessfully")
public void all_test_cases_executed_sucessfully() {
	driver.close();
	System.out.println("log in sucesfull");

}


}
