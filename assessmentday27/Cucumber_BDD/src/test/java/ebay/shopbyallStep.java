package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shopbyallStep {
	WebDriver driver;
	

@Given("website shoulddd be openedd in browser")
public void website_shoulddd_be_openedd_in_browser() {
	driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
}

@When("click onn shopbyall btn")
public void click_onn_shopbyall_btn() {
	eBay_pageclass pg = new eBay_pageclass(driver);
	pg.shopbyall();
    
}

@Then("shop by all done")
public void shop_by_all_done() {
	driver.close();
	System.out.println("done");
    
}




}
