package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dailydealsStep {
	WebDriver driver;

@Given("open the eBay website in uur browserrr")
public void open_the_e_bay_website_in_uur_browserrr() {
	  driver = new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
}

@When("click on daily deals")
public void click_on_daily_deals() {
	eBay_pageclass pg = new eBay_pageclass(driver);
	pg.daily_deals();
    
}

@Then("daily deals page is opened")
public void daily_deals_page_is_opened() {
	driver.close();
	System.out.println("daily deals are opened");
    
}




}
