package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableClass {
            
	
	public static WebDriver driver;

	public void getDriver(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();	
				driver = new ChromeDriver();
			}else if (browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
			}else {
				System.out.println("Invalid browser");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	//Launch URL
	public void launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// WebElement
	public WebElement findElement(String locator,String elementPath) {
		WebElement fElement = null;
		try {
			if (locator.equalsIgnoreCase("id")) {
				fElement = driver.findElement(By.id(elementPath));	
			}else if (locator.equalsIgnoreCase("xpath")) {
				fElement = driver.findElement(By.xpath(elementPath));
			}else if (locator.equalsIgnoreCase("name")) {
				fElement = driver.findElement(By.name(elementPath));
			}else if (locator.equalsIgnoreCase("classname")) {
				fElement = driver.findElement(By.className(elementPath));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return fElement;
	}

	//SendKeys for text
	public void sendText(WebElement element, String data) {
		try {
			element.sendKeys(data);
		} catch (Exception e) {
			System.out.println(e);			
		}
	}

	//Click
	public void btnClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	//Select - drop down
	public void selectDropDown(WebElement element,String selectType, String select) {
		try {
			Select se = new Select(element);
			if (selectType.equalsIgnoreCase("value")) {
				se.selectByValue(select);	
			}else if (selectType.equalsIgnoreCase("index")) {
				se.selectByIndex(Integer.parseInt(select));
			}else if (selectType.equalsIgnoreCase("visibletext")) {
				se.selectByVisibleText(select);
			}


		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// Get attribute
	public String getAttributeValue(WebElement element) {
		String attribute = null;
		try {
			attribute = element.getAttribute("value");

		} catch (Exception e) {
			System.out.println(e);
		}
		return attribute;
	}








	//File for excel sheet
	public String getDataFromExcel(String pathName,String sheetName,int rowNum, int cellNum) throws IOException {
		String value = null;
		try {
			File file = new File(pathName);	
			FileInputStream fileInput = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(fileInput);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
			}else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				value = dateFormat.format(dateCellValue);
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return value;
	}

	
}
