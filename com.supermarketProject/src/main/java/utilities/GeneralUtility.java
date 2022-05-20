package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtility {

	

	public void enterValue(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public void clickElement(WebElement element)
	{
		element.click();
		
	}
	
	public void scrolldown(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public boolean elementDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	
	public boolean elementSelected(WebElement element)
	{
		return element.isSelected();
	}
	
	public boolean elementEnabled(WebElement element)
	{
		return element.isEnabled();
	}
	
	public void addThreadSleep() throws InterruptedException
	{
		Thread.sleep(500);
	}
	
	public void addImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void navigateBack(WebDriver driver)
	{
		driver.navigate().back();
	}
	
	public String getText(WebElement element)
	{
		return element.getText();
		
	}
	
	public String getTitle(WebDriver driver)
	{
		return driver.getTitle();
		
	}
	
	public String getUrl(WebDriver driver)
	{
		return driver.getCurrentUrl();
		
	}
	public void alert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void selectDropdownByindex(WebElement element , int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
}
