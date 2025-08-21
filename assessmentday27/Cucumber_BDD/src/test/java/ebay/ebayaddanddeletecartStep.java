package ebay;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ebayaddanddeletecartStep {
	WebDriver driver;
	

@Given("eBay should be opend in web browser")
public void e_bay_should_be_opend_in_web_browser() {
	driver = new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@When("search an iteam and add it into cart")
public void search_an_iteam_and_add_it_into_cart() throws InterruptedException {
	eBay_pageclass pg = new eBay_pageclass(driver);
	pg.singleitem();

}

@Then("item is added to cart")
public void item_is_added_to_cart() {
	System.out.println("item added to cart");
    
}

@When("click on cart and delete item")
public void click_on_cart_and_delete_item() {
	eBay_pageclass pg = new eBay_pageclass(driver);
	pg.deletecart();
}

@Then("delted from cart")
public void delted_from_cart() {
    driver.close();
    System.out.println("deleted sucessfully");
}


}
