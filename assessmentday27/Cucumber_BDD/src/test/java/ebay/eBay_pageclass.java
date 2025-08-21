package ebay;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class eBay_pageclass {
	WebDriver driver;

	By email = By.id("userid");
	By passw = By.id("pass");
	By cont = By.id("signin-continue-btn");
	By submit = By.id("sgnBt");
	By searchh = By.id("gh-ac");
    By productLink = By.xpath("//*[@id=\"item249b1efa99\"]/div/div[2]/a/div/span"); 
    By addtocart = By.xpath("//*[@id=\"atcBtn_btn_1\"]"); 
    By personalInfo = By.id("account-settings-link-PI");
    By editAddressBtn = By.id("individual_personal_info_address_edit_button");
    By streetAddress = By.cssSelector("input[aria-label='Street address']");
	By item = By.xpath("//*[@id=\"item1d909ffc3d\"]/div/div[1]/div/a/div/img");
	By adtocart = By.id("atcBtn_btn_1");
    By removecart = By.cssSelector("button[data-test-id='cart-remove-item']");
    By streetAddressOptional = By.id("streetAddressOptional");
    By city = By.id("city");
    By zipcode = By.id("postalCode");
    By submitAddressBtn = By.id("address_edit_submit_button");
	By ctlogo = By.cssSelector("span[class=\"gh-cart__icon\"]");
	By dlt = By.cssSelector("button[data-test-id=\"cart-remove-item\"]");
	By logo = By.id("gh-logo");
	By act = By.cssSelector("div>button[class=\"gh-flyout__target gh-flyout__target--left\"]");
	By actst = By.id("account-settings-link-PI");
	By changeuser = By.id("individual_username_edit_button");
	By usubmit = By.id("username_submit_edit_btn");

	public eBay_pageclass(WebDriver driver) {
		this.driver = driver;
	}

	public void username() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement username = driver.findElement(email);
		username.sendKeys("rohithreddy994842@gmail.com");
		username.sendKeys(Keys.ENTER);
		driver.findElement(cont).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement pass = driver.findElement(passw);
		pass.sendKeys("Rohith@8096");
		pass.sendKeys(Keys.ENTER);
		// driver.findElement(By.id("sgnBt")).click();

	}

	public void multipltvalue() {
		driver.findElement(logo).click();
		WebElement search = driver.findElement(searchh);
		String[] searches = { "watch", "phone", "laptop" };
		for (String s : searches) {
			search.sendKeys(s);
			search.sendKeys(Keys.ENTER);
			search = driver.findElement(By.id("gh-ac"));
			search.clear();

		}

	}

	public void singleitem() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();

		WebElement username = driver.findElement(email);
		username.sendKeys("rohithreddy994842@gmail.com");
		username.sendKeys(Keys.ENTER);
		driver.findElement(cont).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement pass = driver.findElement(passw);
		pass.sendKeys("Rohith@8096");
		pass.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement sb = driver.findElement(searchh);
        sb.clear();
        sb.sendKeys("samsung galaxy s24 ultra");
        sb.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(productLink).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		
        driver.findElement(addtocart).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(removecart).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	
	public void deletecart() {

		WebElement cart = driver.findElement(By.cssSelector("span[class=\"gh-cart__icon\"]"));
		cart.click();

		WebElement delete = driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
		delete.click();
		
	}
	 

	

	public void changeusername() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();
//		  driver.get("https://accountsettings.ebay.com/uas");

		WebElement username = driver.findElement(email);
		username.sendKeys("rohithreddy994842@gmail.com");
		username.sendKeys(Keys.ENTER);
		driver.findElement(cont).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement pass = driver.findElement(passw);
		pass.sendKeys("Rohith@8096");
		pass.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://accountsettings.ebay.com/uas");
		driver.findElement(By.id("account-settings-link-PI")).click();
//		driver.findElement(actst).click();
//		 driver.findElement(changeuser).click();
//		  WebElement username1=driver.findElement(By.id("user_name"));
//		  username1.clear();
//		  username1.sendKeys("Rohith8096");
//		  username1.sendKeys(Keys.ENTER);
//			driver.findElement(usubmit).click();
	}

	public void changeaddressbtn() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();
		WebElement username = driver.findElement(email);
		username.sendKeys("rohithreddy994842@gmail.com");
		username.sendKeys(Keys.ENTER);
		driver.findElement(cont).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement pass = driver.findElement(passw);
		pass.sendKeys("Rohith@8096");
		pass.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://accountsettings.ebay.com/uas");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.findElement(personalInfo).click();
		driver.findElement(editAddressBtn).click();

		WebElement sa = driver.findElement(streetAddress);
		sa.clear();
		sa.sendKeys("hyd");

		WebElement sao = driver.findElement(streetAddressOptional);
		sao.clear();
		sao.sendKeys("ecil");

		WebElement cityEl = driver.findElement(city);
		cityEl.clear();
		cityEl.sendKeys("hyd");

		WebElement zipEl = driver.findElement(zipcode);
		zipEl.clear();
		zipEl.sendKeys("500043");

		driver.findElement(submitAddressBtn).click();
	}

	public void shopbycat() {
		driver.findElement(By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]")).click();
		driver.findElement(By.cssSelector("a[_sp=\"m570.l3410\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li[3]/span/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a")).click();
	}

	public void shopbyall() {
		driver.findElement(By.cssSelector("select>option[value=\"12576\"]")).click();
		driver.findElement(By.id("gh-search-btn")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a")).click();

	}

	public void daily_deals() {
		driver.findElement(logo).click();
		driver.findElement(By.cssSelector("a[_sp=\"m570.l3188\"]")).click();
	}

	public void facebook() {
		driver.findElement(logo).click();
		driver.findElement(By.cssSelector("li>a[_exsp=\"m571.l2942\"]")).click();

	}

	public void signout() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement username = driver.findElement(email);
		username.sendKeys("rohithreddy994842@gmail.com");
		username.sendKeys(Keys.ENTER);
		driver.findElement(cont).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement pass = driver.findElement(passw);
		pass.sendKeys("Rohith@8096");
		pass.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement elementToHover = driver.findElement(By.cssSelector("span>div[class=\"gh-flyout is-left-aligned\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).build().perform();
		driver.findElement(By.cssSelector("a[_sp=\"m570.l2622\"]")).click();
	}

}
