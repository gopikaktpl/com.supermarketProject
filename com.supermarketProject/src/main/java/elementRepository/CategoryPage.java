package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ExplicitWait;
import utilities.GeneralUtility;

public class CategoryPage {
	WebDriver driver;
	GeneralUtility gl =new GeneralUtility();
	ExplicitWait wait=new ExplicitWait();
	
	@FindBy(xpath="//*[@class='m-0 text-dark']")
	WebElement heading;
	
	@FindBy(xpath="//*[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(xpath="//input[@name='un']")
	WebElement category;
	
	@FindBy(xpath="//button[@name='Search']")
	WebElement searchSubmit;
	
	@FindBy(xpath="//table[contains(@class,'table table-bordered ')]//tr[1]//td[1]")
	WebElement searchResult;
	
	@FindBy(xpath="(//*[@class='fas fa-edit'])[1]")
	WebElement newCategory;
	
	@FindBy(xpath="//input[@id='category']")
	WebElement enterNewCategory;
	
	@FindBy(xpath="(//span[text()='New'])[1]")
	WebElement selectgroupNew;
	
	@FindBy(xpath="//button[@name='create']")
	WebElement save;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	WebElement categoryCreatedSuccessful;
	
	@FindBy(xpath="//*[@class='card-title']")
	WebElement enterCategoryInformation;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-fix']")
	WebElement cancel;
	
	@FindBy(xpath="(//*[@class='fas fa-trash-alt'])[6]")
	WebElement delect;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	WebElement categoryDelectedSuccessful;
	
	
	
	public CategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String getHeading()
	{
		return gl.getText(heading);
		
	}
	public void clickSearch()
	{
		gl.clickElement(search);
	}
	
	public void waitForSearch()
	{
		wait.elementToBeClickable(driver, search);
	}
	public void enterCategoryValueToBeTested(String name)
	{
		gl.enterValue(category, name);
	}
	public void clickSearchSubmit()
	{
		gl.clickElement(searchSubmit);
	}
	public String getSearchResult()
	{
		return gl.getText(searchResult);
		
	}
	public void clicknew() {
		gl.clickElement(newCategory);
	}
	public void enterNewCategory(String name)
	{
		gl.enterValue(enterNewCategory, name);
	}
	public void selectgroup()
	{
		gl.clickElement(selectgroupNew);
	}
	public void clicksave()
	{
		gl.clickElement(save);
	}
	public boolean SuccessfullMeassage()
	{
		return gl.elementDisplayed(categoryCreatedSuccessful);
	}
	public void clickCancel()
	{
		gl.clickElement(cancel);
	}
	public boolean enterCategoryInfopresent()
	{
		return gl.elementDisplayed(enterCategoryInformation);
	}
	public void clickDelect()
	{
		gl.clickElement(delect);
	}
	public void alert()
	{
		gl.alert(driver);
	}
	public boolean isDelectMessagePresent()
	{
		return gl.elementDisplayed(categoryDelectedSuccessful);
		
	}
}