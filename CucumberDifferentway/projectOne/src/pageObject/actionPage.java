package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class actionPage {

	public static WebDriver driver;
	
	
	public void clickElement(String locators)
	{
		if(locators.contains("xpath"))
		{
			driver.findElement(By.xpath(locators.split(":")[1])).click();	
		}
		else if(locators.contains("cssSelector"))
		{
			driver.findElement(By.cssSelector(locators.split(":")[1])).click();
		}
		else if(locators.contains("id"))
		{
			driver.findElement(By.id(locators.split(":")[1])).click();
		}
		else if(locators.contains("linkTest"))
		{
			driver.findElement(By.linkText(locators.split(":")[1])).click();
		}
		else if(locators.contains("name"))
		{
			driver.findElement(By.name(locators.split(":")[1])).click();
		}
		else if(locators.contains("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(locators.split(":")[1])).click();
		}
		else if (locators.contains("tagName"))
		{
			driver.findElement(By.tagName(locators.split(":")[1])).click();
		}
		else if(locators.contains("className"))
		{
			driver.findElement(By.className(locators.split(":")[1])).click();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	public void typeOnText(String locators,String value)

	{
		if(locators.contains("xpath"))
		{
			driver.findElement(By.xpath(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("cssSelector"))
		{
			driver.findElement(By.cssSelector(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("id"))
		{
			driver.findElement(By.id(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("linkTest"))
		{
			driver.findElement(By.linkText(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("name"))
		{
			driver.findElement(By.name(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("partialLinkText"))
		{
			driver.findElement(By.partialLinkText(locators.split(":")[1])).sendKeys(value);
		}
		else if (locators.contains("tagName"))
		{
			driver.findElement(By.tagName(locators.split(":")[1])).sendKeys(value);
		}
		else if(locators.contains("className"))
		{
			driver.findElement(By.className(locators.split(":")[1])).sendKeys(value);
		}

	}
	
	public  String getElementValue(String locators)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(locators.contains("xpath"))
		{
			return driver.findElement(By.xpath(locators.split(":")[1])).getText();	
		}
		else if(locators.contains("cssSelector"))
		{
			return	driver.findElement(By.cssSelector(locators.split(":")[1])).getText();
		}
		else if(locators.contains("id"))
		{
			return	driver.findElement(By.id(locators.split(":")[1])).getText();
		}
		else if(locators.contains("linkTest"))
		{
			return	driver.findElement(By.linkText(locators.split(":")[1])).getText();
		}
		else if(locators.contains("name"))
		{
			return	driver.findElement(By.name(locators.split(":")[1])).getText();
		}
		else if(locators.contains("partialLinkText"))
		{
			return	driver.findElement(By.partialLinkText(locators.split(":")[1])).getText();
		}
		else if (locators.contains("tagName"))
		{
			return	driver.findElement(By.tagName(locators.split(":")[1])).getText();
		}
		else if(locators.contains("className"))
		{
			return	driver.findElement(By.className(locators.split(":")[1])).getText();
		}
		return null;

	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
