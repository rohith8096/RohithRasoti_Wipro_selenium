package Assessmentday24;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class multipletests {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
  @Test(invocationCount = 2)
  public void search() throws InterruptedException {
	  driver.get("https://www.ebay.com/");
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  
	  String[] searches= {"Headphones","phone","books"};
	  for(String s:searches) {
		  search.sendKeys(s);
		  search.sendKeys(Keys.ENTER);
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  search=driver.findElement(By.id("gh-ac"));
			  search.clear();  
		  
	  } 
	  Thread.sleep(3000);
	  driver.findElement(By.id("gh-logo")).click();
  }

  
  @AfterClass
  public void afterClass(){
	  driver.close();
  }
  
}
