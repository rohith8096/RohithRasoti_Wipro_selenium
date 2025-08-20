package assessmentday23;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class pageClass {
    By email = By.id("userid");
    By pass = By.id("pass");
    By cont = By.id("signin-continue-btn");
    By submit = By.id("sgnBt");
    By search = By.id("gh-ac");
    By productLink = By.xpath("//*[@id=\"item249b1efa99\"]/div/div[2]/a/div/span"); 
    By addtocart = By.xpath("//*[@id=\"atcBtn_btn_1\"]"); 
    By carticon = By.id("gh-cart-n");
    By removecart = By.cssSelector("button[data-test-id='cart-remove-item']");
    By logo = By.id("gh-logo");
    By personalInfo = By.id("account-settings-link-PI");
    By editAddressBtn = By.id("individual_personal_info_address_edit_button");
    By streetAddress = By.cssSelector("input[aria-label='Street address']");
    By streetAddressOptional = By.id("streetAddressOptional");
    By city = By.id("city");
    By zipcode = By.id("postalCode");
    By submitAddressBtn = By.id("address_edit_submit_button");
    By dropdown = By.cssSelector("#gh-cat");
    By searchBtn = By.id("gh-search-btn");
    By allCategoriesTitle = By.className("gh-categories__title");
    By allCategoriesCol = By.className("gh-categories__col");
    By countryButton = By.cssSelector("button.gf-flag__button");
    By chinaLink = By.linkText("China");

    WebDriver driver;
    Actions act;
    JavascriptExecutor js;

    public pageClass(WebDriver driver) {
        this.driver = driver;
        act = new Actions(driver);
        js = (JavascriptExecutor) driver;
    }

    public void email_in() {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("rohithreddy994842@gmail.com");
    }

    public void pass_in() {
        driver.findElement(pass).clear();
        driver.findElement(pass).sendKeys("Rohith@8096");
    }

    public void con_in() {
        driver.findElement(cont).click();
    }

    public void submit_in() {
        driver.findElement(submit).click();
    }

    public void search_in() throws InterruptedException {
        ArrayList<String> items = new ArrayList<>();
        items.add("watch");
        items.add("shirts");
        items.add("books");

        for (String item : items) {
            WebElement sb = driver.findElement(search);
            sb.clear();
            sb.sendKeys(item);
            sb.sendKeys(Keys.ENTER);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.navigate().back();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        }
    }

    public void addtocart_in() throws InterruptedException {
        WebElement sb = driver.findElement(search);
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
    }

    public void deletecart_in() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(removecart).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public void changeAddress_in() throws InterruptedException {
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

    public void shopByCategories() throws InterruptedException {
        driver.findElement(dropdown).click();
        driver.findElement(By.cssSelector("#gh-cat option[value='267']")).click();
        driver.findElement(searchBtn).click();
    }

    public void shopByAllCategories() throws InterruptedException {
        driver.findElement(allCategoriesTitle).click();
        driver.findElement(allCategoriesCol).click();
    }

    public void changeLanguage() throws InterruptedException {
        js.executeScript("window.scrollBy(0,3000)");
        driver.findElement(countryButton).sendKeys(Keys.ENTER);
        driver.findElement(chinaLink).click();
    }
}