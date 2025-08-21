package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebookStep {
	WebDriver driver;

@Given("eBay shoulddd be openeeddd in browser")
public void e_bay_shoulddd_be_openeeddd_in_browser() {
	driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
}

@When("click on facebook icon")
public void click_on_facebook_icon() {
	eBay_pageclass pg = new eBay_pageclass(driver);
	pg.facebook();

}

@Then("facebook is opened")
public void facebook_is_opened() {
	driver.close();
	System.out.println("facebook is opened");
    
}




}
