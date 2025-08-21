package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class eBayadresschangeStep {
	WebDriver driver;

@Given("ebay website should be opend and a accunt should be loggedin")
public void ebay_website_should_be_opend_and_a_accunt_should_be_loggedin() {
	driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
}

@When("click on accountsettings and change address")
public void click_on_accountsettings_and_change_address() {
	eBay_pageclass pg = new eBay_pageclass(driver);
	pg.changeaddressbtn();
   
}

@Then("address changed sucessfully")
public void address_changed_sucessfully() {
	driver.close();
	System.out.println("sucessfully adress changed");
    
}




}
