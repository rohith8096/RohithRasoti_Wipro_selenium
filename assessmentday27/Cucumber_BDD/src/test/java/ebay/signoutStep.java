package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signoutStep {
	WebDriver driver;

@Given("an accountt is logged in eBay")
public void an_accountt_is_logged_in_e_bay() {
	driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
}

@When("click on sigout btn")
public void click_on_sigout_btn() {
	eBay_pageclass pg = new eBay_pageclass(driver);
	pg.signout();
	
  
}

@Then("signed out sucessfully")
public void signed_out_sucessfully() {
	driver.close();
	System.out.println("signed out......");
    
}




}
