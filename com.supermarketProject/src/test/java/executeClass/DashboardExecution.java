package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.ManageProductPage;

public class DashboardExecution extends BaseClass{
	DashboardPage dp;
	LoginPage lp;
	
  @Test(priority = 0)
  public void verifyLoginUserIsAdmin ()
  {
	 
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new  DashboardPage(driver);
	  String actual=dp.getText();
	  String expected="Admin";
	  Assert.assertEquals(actual, expected);
	 
	  
  }
  
  @Test(priority = 1)
  public void verifyPageTitle()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	 dp= new  DashboardPage(driver);
	 String atual= dp.getDashboardTitle();
	  
	 String expected="Dashboard | 7rmart supermarket";
	 Assert.assertEquals(atual, expected);
	  
  }
  @Test(priority = 2)
  public void verifyManageProductPageGettingOrNot()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new  DashboardPage(driver);
	  dp.clickManageProduct();
	  ManageProductPage mp=new ManageProductPage(driver);
	  String atual=mp.getText();
	  String expected="List Products";
	  Assert.assertEquals(atual, expected);
  }
  
  @Test(priority = 3)
  
  public void VerifymanageCODPageGettingOrNot()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new  DashboardPage(driver);
	  dp.clickManageCOD();
	  String actual=dp.getDashboardTitle();
	  String expected="Add COD | 7rmart supermarket";
	  Assert.assertEquals(actual, expected);
  }
  
 @Test(priority = 4)
  
  public void verifyManageOfferCodePageGettingOrNot()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new  DashboardPage(driver);
	  dp.clickManageOfferCode();
	  String atual=dp.getDashboardTitle();
	  String expected="List Offercodes | 7rmart supermarket";
	  Assert.assertEquals(atual, expected);
	  
  }
 
 @Test(priority =5)
 public void isLogoutOptionDisplayed()
 
 {
	 lp=new LoginPage(driver);
	 lp.enterUsername("admin");
	 lp.enterPassword("admin");
	 lp.clickSignInButton();
	 dp= new  DashboardPage(driver);
	 dp.clickAdmin();
	 boolean atual=dp.logoutIsDisplayed();
	 Assert.assertTrue(atual);
 }	
 
 @Test(priority=6)
 public void verifyLogoutFunctinality()
 {
	 lp=new LoginPage(driver);
	 lp.enterUsername("admin");
	 lp.enterPassword("admin");
	 lp.clickSignInButton();
	 dp= new  DashboardPage(driver);
	 dp.clickAdmin();
	 dp.waitLogOut();
	 dp.clickLogout();
	 lp= new LoginPage(driver);
	 String atual= lp.getLoginPageTitle();
	 String expected = "Login | 7rmart supermarket";
	 Assert.assertEquals(atual, expected); 
 }
 @Test(priority=7)
 
 public void isExpenceCategoryUnderManageExpenceCanBeEnable()
 {
	 lp=new LoginPage(driver);
	 lp.enterUsername("admin");
	 lp.enterPassword("admin");
	 lp.clickSignInButton();
	 dp= new  DashboardPage(driver);
	 dp.clickOnManageExpence();
	 dp.enableExpenceCategory();
	 boolean atual=dp.isExpenceCategoryEnabled();
	 Assert.assertTrue(atual);
 }
 
 
}
  
  
  
  
