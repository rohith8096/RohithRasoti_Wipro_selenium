package ebay;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
	WebDriver driver;

	@Given("user is on the homepage")
	public void user_is_on_the_homepage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
	}

	@When("^user searches for (.*)$")
	public void user_searches_for_item(String item) {
		driver.findElement(By.id("gh-ac")).clear();
		driver.findElement(By.id("gh-ac")).sendKeys(item);
		driver.findElement(By.id("gh-ac")).sendKeys(Keys.ENTER);
	}

	@Then("relevant search results should be displayed")
	public void relevant_search_results_should_be_displayed() {
		System.out.println("Search completed for multiple <item>");
		driver.quit();
	}
}
