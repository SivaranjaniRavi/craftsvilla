package com.craftsvilla.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public static void selectByIndex(WebElement element,int n)
	{
	Select sel=new Select(element);
	sel.selectByIndex(n);
	}
	public static void selectByValue(WebElement element,String value)
	{
	Select sel=new Select(element);
	sel.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element,String text)
	{
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
	}
	public static void moveToElement(WebElement element,WebDriver driver)
	{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
	}
	public static void dragAndDrop(WebElement source,WebElement target,WebDriver driver)
	{
	Actions act=new Actions(driver);
	act.dragAndDrop(source, target);
	}
	
}
