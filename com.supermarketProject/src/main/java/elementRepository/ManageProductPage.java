package elementRepository;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.RobotClass;
import utilities.GeneralUtility;

public class ManageProductPage {

	WebDriver driver;
	GeneralUtility gl =new GeneralUtility();
	ExplicitWait wait=new ExplicitWait();
	RobotClass up=new RobotClass();
	
	
	@FindBy(xpath="(//*[text()='List Products'])[1]")
	WebElement listProduct;
	
	@FindBy(xpath= "//*[@class='btn btn-rounded btn-danger']")
	WebElement newproduct;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement enterNewProduct;
	
	@FindBy(xpath="//*[@id='cat_id']")
	WebElement category;
	
	@FindBy(xpath="//select[@id='sub_id']")
	WebElement subCategory;
	
	@FindBy(xpath="//*[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(xpath="//input[@name='un']")
	WebElement title_search;
	
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")
	WebElement submit_search;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//tr[1]//td[1]")
	WebElement titleoftheSearchProduct;
	
	@FindBy(xpath="//button[@name='Reset']")
	WebElement resetUnderSearch;
	
	@FindBy(xpath="(//*[@class='page-link'])[2]")
	WebElement page2;
	
	@FindBy(xpath="(//*[@class='fas fa-trash-alt'])[2]")
	WebElement delect;
	
	@FindBy(xpath="//*[contains(@class,'alert alert-success ')]")
	WebElement delectmessage;
	
	@FindBy(id="m_weight")
	WebElement weightValue;
	
	@FindBy(id="w_unit")
	WebElement weightUnit;
	@FindBy(id="w_price")
	WebElement price;
	
	@FindBy(id="main_img")
	WebElement image;
	
	@FindBy(id="w_stock")
	WebElement stock;
	
	@FindBy(xpath="//input[@id='main_img']")
	WebElement chooseimage;
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	WebElement save;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	
	@FindBy(id="max_weight")
	WebElement maxi;
	
	
	
	public ManageProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void threadSleep() throws InterruptedException
	{
		gl.addThreadSleep();
	}
	
	

	public String getText()
	{
		return gl.getText(listProduct);
		
	}
	
	
	
	public void clickSearch()
	{
		gl.clickElement(search);
	}
	public void enterTitleToBeSearched(String title)
	{
		gl.enterValue(title_search, title);
	}
	public void clickSumitSearch()
	{
		gl.clickElement(submit_search);
	}
	
	public String searchResult()
	{
		return gl.getText(titleoftheSearchProduct);
		
	}
	public void resetButton()
	{
		gl.clickElement(resetUnderSearch);
	}
	
	public void clickPage2()
	{
		gl.clickElement(page2);
	}
	
	public boolean ispage2displayed()
	{
		return gl.elementDisplayed(page2);
	}
	public void clickDelect()
	{
		gl.clickElement(delect);
	}
	public void alertMessage()
	{
		gl.alert(driver);
	}
	
	public boolean isDelectMessageDisplayed()
	{
		return gl.elementDisplayed(delectmessage);
		
	}
	public void clicknew()
	{
		gl.clickElement(newproduct);
		
	}
	public void enterTitle(String name)
	{
		gl.enterValue(enterNewProduct, name);
		
	}
	public void selectCategory()
	{
		gl.selectDropdownByindex(category, 1);
	}
	public void SelectSubcategory()
	{
		gl.selectDropdownByindex(subCategory, 1);
	}
	public void enterWeightValue(String value)
	{
		gl.enterValue(weightValue, value);
	}
	public void selectWeightUnit()
	{
		gl.selectDropdownByindex(weightUnit, 1);
		
	}
	public void enterPrice(String rs)
	{
		gl.enterValue(price, rs);
	}
	public void enterstock(String num)
	{
		gl.enterValue(stock, num);
	}
	public void uploadimage(String path) throws InterruptedException, AWTException
	{
		up.fileUploadWithRobortclass(path);
	}
	public void clickChooseimage()
	{
		gl.clickElement(chooseimage);
	}
	public void clicksave()
	{
		gl.clickElement(save);
	}
	public void entermaxi(String num)
	{
		gl.enterValue(category, num);
	}
	public boolean isAlert()
	{
		return gl.elementDisplayed(alert);
	}
}
