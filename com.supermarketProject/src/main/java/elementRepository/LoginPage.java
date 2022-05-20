package elementRepository;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelRead;
import utilities.GeneralUtility;

public class LoginPage {
	
	WebDriver driver;
	GeneralUtility gl =new GeneralUtility();
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath ="//*[text()='Sign In']")
	WebElement signIn;
	
	@FindBy(xpath="//label[@for='remember']")
	WebElement rememberMeCheckBox;
	
	@FindBy(xpath="//*[@class='alert alert-danger alert-dismissible']")
	WebElement alertMessage;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String name)
	{
		gl.enterValue(username, name);
	}
	
	public void enterPassword(String Pass)
	{
		gl.enterValue(password, Pass);
	}
	
	public void clickSignInButton()
	{
		gl.clickElement(signIn);
	}
	
	public void clickRememberMeCheckBox()
	{
		gl.clickElement(rememberMeCheckBox);
	}
	
	public boolean rememberMeCheckBoxEnabled()
	{
		return gl.elementEnabled(rememberMeCheckBox);
	}
	
	public String getLoginPageTitle()
	{
		return gl.getTitle(driver);
		
	}
	
	public String readUsername(int r,int c) throws IOException 
	{
		return ExcelRead.readStringData(r, c);
		
	}
	
	public String readPassword(int r,int c) throws IOException
	{
		return ExcelRead.readStringData( r, c);
		
	}
	public boolean isalertMessagePresent()
	{
		return gl.elementDisplayed(alertMessage);
	}
	
}

