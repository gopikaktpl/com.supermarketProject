package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.GeneralUtility;

public class AdminUsersPage {
	
	WebDriver driver;
	GeneralUtility gl =new GeneralUtility();
	ExplicitWait wait=new ExplicitWait();
	
	@FindBy(xpath="//*[@class='m-0 text-dark']")
	WebElement adminUserHeading;
	
	@FindBy(xpath="//*[@class='btn btn-rounded btn-danger']")
	WebElement newuser;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//select[@id='user_type']")
	WebElement usertype;
	
	@FindBy(xpath="//button[@name='Create']")
	WebElement save;
	
	@FindBy(xpath="//*[contains(@class,'alert alert-success ')]")
	WebElement succesfulmessage;
	
	@FindBy(xpath="(//*[@class='fas fa-trash-alt'])[1]")
	WebElement delect;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	WebElement delectmessage;
	
	@FindBy(xpath="//*[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(xpath="//input[@id='un']")
	WebElement usernameToBeSearched;
	
	@FindBy(xpath="//button[@name='Search']")
	WebElement searchSubmit;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[1]")
	WebElement searchResult;
	
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String getHeading()
	{
		return gl.getText(adminUserHeading);
	}
	
	public void enterUsername(String name)
	{
		gl.enterValue(username, name);
	}
	
	public void enterpassword(String num)
	{
		gl.enterValue(password, num);
	}
	
	public void selectUserType(int index)
	{
		gl.selectDropdownByindex(usertype, index);
	}
	
	public void clickSave()
	{
		gl.clickElement(save);
	}
	public void clickNew()
	{
		gl.clickElement(newuser);
	}
	
	public boolean isDisplayed()
	{
		return gl.elementDisplayed(succesfulmessage);
	}
	
	public void clickDelect()
	{
		gl.clickElement(delect);
	}
	public void alert()
	{
		gl.alert(driver);
		
	}
	public boolean delectMessageDisplayed()
	{
		return gl.elementDisplayed(delectmessage);
	}
	
	public void clickSearch()
	{
		gl.clickElement(search);
	}
	public void enterUsernameToBeSearched(String name)
	{
		gl.enterValue(usernameToBeSearched, name);
	}
	public void clickSearchSubmit()
	{
		gl.clickElement(searchSubmit);
	}
	public String searchResult()
	{
		return gl.getText(searchResult);
	}
	
	public void waitNewUser()
	{
		wait.elementToBeClickable(driver, newuser);
	}
}
