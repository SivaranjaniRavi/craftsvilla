package com.craftsvilla.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
public WebDriver driver;
public BasePage(WebDriver driver)
{
	this.driver=driver;
}
public void verifyTitle (String etitle)
{
	try
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs(etitle));
		Reporter.log("Title is matching:"+etitle, true);
		Assert.fail();
	}
	catch(Exception e)
	{
		Reporter.log("Title is not matching:"+etitle, true);
		Assert.fail();
	}
}
public void verifyElementPresent(WebElement element)
{
	try
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.invisibilityOf(element));
		Reporter.log("Element is matching:"+element, true);
		Assert.fail();
	}
	catch(Exception e)
	{
		Reporter.log("Element is not matching:"+element, true);
		Assert.fail();
	}
}
}
