package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ebaychangenameStep {
	WebDriver driver;

@Given("a account should be logged in eBay")
public void a_account_should_be_logged_in_e_bay() {
	  driver = new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 
}

@When("open settings and change name")
public void open_settings_and_change_name() {
	eBay_pageclass pg = new eBay_pageclass(driver);
	pg.changeusername();
    
}

@Then("name is sucessfuly changed")
public void name_is_sucessfuly_changed() {
   driver.close();
   System.out.println("name changed sucessfully");
}




}
