package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shopbycarStep {
	WebDriver driver;
	

@Given("eBay home page should be opened")
public void e_bay_home_page_should_be_opened() {
	driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("click on shop by cat btm")
public void click_on_shop_by_cat_btm() {
	eBay_pageclass pg = new eBay_pageclass(driver);
	pg.shopbycat();
}

@Then("sucessfully shpped by category")
public void sucessfully_shpped_by_category() {
	driver.close();
	System.out.println("executed sucessfully");
}



}
