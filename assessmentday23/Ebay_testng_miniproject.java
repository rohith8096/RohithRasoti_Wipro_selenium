package assessmentday23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Ebay_testng_miniproject {
    WebDriver driver;
    JavascriptExecutor jse;
    pageClass pc;

    @Test(priority = 1)
    public void loginTest() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        pc.email_in();
        pc.con_in();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        pc.pass_in();
        pc.submit_in();
    }

    @Test(priority = 2)
    public void multipleSearchTest() throws InterruptedException {
        pc.search_in();
    }

    @Test(priority = 3)
    public void addToCartTest() throws InterruptedException {
        pc.addtocart_in();
    }

    @Test(priority = 4)
    public void deleteFromCartTest() throws InterruptedException {
        pc.deletecart_in();
    }

    @Test(priority = 5)
    public void NameTest() throws InterruptedException {
        pc.changeAddress_in();
    }

    @Test(priority = 6)
    public void shopByCategoriesTest() throws InterruptedException {
        pc.shopByCategories();
    }

    @Test(priority = 7)
    public void shopByAllCategoriesTest() throws InterruptedException {
        pc.shopByAllCategories();
    }

    @Test(priority = 8)
    public void languageChange() throws InterruptedException {
        pc.changeLanguage();
    }

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        jse = (JavascriptExecutor) driver;
        pc = new pageClass(driver);
    }

    @AfterTest
    public void afterTest() {
        Assert.assertTrue(true, "Test finished");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
