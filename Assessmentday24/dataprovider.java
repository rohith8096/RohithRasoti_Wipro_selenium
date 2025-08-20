package Assessmentday24;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	@DataProvider(name = "excelData")
	public Object[][] excelDataProvider() throws IOException {

		String excelPath = "C:\\Users\\rohit\\Desktop\\Logindata.xlsx";
		String sheetName = "sheet1";

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows - 1][cols];

		for (int i = 1; i < rows; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				Cell cell = row.getCell(j);
				data[i - 1][j] = (cell == null) ? "" : cell.toString();
			}
		}

		workbook.close();
		fis.close();

		return data;
	}

	@Test(dataProvider = "excelData", dataProviderClass = dataprovider.class)
	public void testLogin(String username1, String password1) throws InterruptedException {
		System.out.println("Username: " + username1 + " | Password: " + password1);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://zero.webappsecurity.com/login.html");

		driver.findElement(By.id("user_login")).sendKeys(username1);
		driver.findElement(By.id("user_password")).sendKeys(password1);

		driver.findElement(By.name("submit")).click();

		Thread.sleep(3000);
	}

}
