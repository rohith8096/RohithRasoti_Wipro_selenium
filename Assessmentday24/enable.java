package Assessmentday24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class enable {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
  @Test(enabled=true)
  public void login() throws InterruptedException {
	  WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
	  login.click();
	  Thread.sleep(15000);
	  WebElement name=driver.findElement(By.id("userid"));
	  name.sendKeys("rohithreddy994842@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();
	  Thread.sleep(3000);
	  WebElement pass=driver.findElement(By.id("pass"));
	  pass.sendKeys("Rohith@8096");
	  driver.findElement(By.id("sgnBt")).click();
	  Thread.sleep(4000); 
  }
  @Test(enabled=false)
  public void search() throws InterruptedException {
	  driver.get("https://www.ebay.com/");
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  
	  String[] searches= {"Headphones","phone","laptop"};
	  for(String s:searches) {
		  search.sendKeys(s);
		  search.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  search=driver.findElement(By.id("gh-ac"));
			  search.clear();  
		  
	  } 
	  Thread.sleep(3000);
	  driver.findElement(By.id("gh-logo")).click();
  }
  @Test()
  public void logout() throws InterruptedException {
	  WebElement elementToHover = driver.findElement(By.cssSelector("span>div[class=\"gh-flyout is-left-aligned\"]"));
	  Actions actions = new Actions(driver);
	  actions.moveToElement(elementToHover).build().perform();
	  Thread.sleep(5000);
	  driver.findElement(By.cssSelector("a[_sp=\"m570.l2622\"]")).click();
	  Thread.sleep(5000);
	  
	  
	  
  }
  
  @AfterClass
  public void afterClass(){
	  driver.close();
  }
  
}
