package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.GeneralUtility;

public class DashboardPage {
	
	WebDriver driver;
	GeneralUtility gl =new GeneralUtility();
	ExplicitWait wait=new ExplicitWait();
	
	
	@FindBy(xpath="//*[@data-toggle='dropdown']")
	WebElement admin;
	
	@FindBy(xpath="(//*[@class='small-box-footer'])[2]")
	WebElement adminUsers;
	
	@FindBy(xpath="(//*[@class='small-box-footer'])[3]")
	WebElement category;
	
	@FindBy(xpath="(//*[@class='small-box-footer'])[4]")
	WebElement manageProduct;
	
	@FindBy(xpath="(//*[@class='small-box-footer'])[5]")
	WebElement manageOfferCode;
	
	@FindBy(xpath="(//*[@class='small-box-footer'])[6]")
	WebElement manageCOD;
	
	@FindBy(xpath ="(//*[@class='dropdown-item'])[2]")
	WebElement logout;
	
	@FindBy(xpath="(//*[@class='fas fa-angle-left right'])[1]")
	WebElement manageExpence;
	
	@FindBy(xpath="(//*[@class='far fa-circle nav-icon'])[1]")
	WebElement expenceCategory;
	
	
	public  DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getText()
	{
		return gl.getText(admin);
		
	}
	public void clickManageProduct()
	{
		gl.clickElement(manageProduct);
	}
	
	public void clickManageOfferCode()
	{
		gl.clickElement(manageOfferCode);
	}
	
	public void clickManageCOD()
	{
		gl.clickElement(manageCOD);
	}
	
	public void clickadminUsers()
	{
		gl.clickElement(adminUsers);
	}
	public String getDashboardTitle()
	{
		return gl.getTitle(driver);
		
	}
	
	public void navigateBackToDashBoard()
	{
		gl.navigateBack(driver);
	}
	
	public void clickAdmin()
	{
		gl.clickElement(admin);
	}
	public boolean logoutIsDisplayed()
	{
		return gl.elementDisplayed(logout);
		
	}
	public void clickLogout()
	{
		gl.clickElement(logout);
	}
	public void clickCategory() {
		gl.clickElement(category);
	}
	public void waitLogOut() {
		wait.elementToBeClickable(driver, logout);
	}
	public void clickOnManageExpence()
	{
		gl.clickElement(manageExpence);
	}
	public void enableExpenceCategory()
	{
		gl.clickElement(expenceCategory);
	}
	
	public boolean isExpenceCategoryEnabled()
	{
		return gl.elementEnabled(expenceCategory);
	}
}
