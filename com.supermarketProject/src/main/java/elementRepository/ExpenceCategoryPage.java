package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.GeneralUtility;

public class ExpenceCategoryPage {
	
	WebDriver driver;
	GeneralUtility gl =new GeneralUtility();
	ExplicitWait wait=new ExplicitWait();
	
	@FindBy(xpath="//*[@class='m-0 text-dark']")
	WebElement expenceCategory;
	
	@FindBy(xpath="//*[@class='btn btn-rounded btn-danger']")
	WebElement newCategory;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement enterTitle;
	
	@FindBy(xpath="//*[@class='fa fa-save']")
	WebElement submit;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	WebElement successfull;
	
	
	public ExpenceCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getHeading()
	{
		return gl.getText(expenceCategory);
	}
	public void clickNew()
	{
		gl.clickElement(newCategory);
	}
   public void enteNew(String title)
   {
	   gl.enterValue(enterTitle, title);
   }
   public  void clickSave()
   {
	   gl.clickElement(submit);
   }
   public boolean successfulMessageIsPresent()
   {
	return gl.elementDisplayed(successfull);
	   
   }
 
}
