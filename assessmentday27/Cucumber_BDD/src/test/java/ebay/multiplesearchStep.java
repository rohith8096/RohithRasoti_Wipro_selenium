package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multiplesearchStep {
	WebDriver driver;

@Given("ebay page should be opened")
public void ebay_page_should_be_opened() {
	 driver = new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("click on search and give values")
public void click_on_search_and_give_values() {
	 eBay_pageclass pg = new eBay_pageclass(driver);
	   pg.multipltvalue();
}

@Then("search completed sucessfully")
public void search_completed_sucessfully() {
   driver.close();
   System.out.println("search completed sucessfully");
}


}
