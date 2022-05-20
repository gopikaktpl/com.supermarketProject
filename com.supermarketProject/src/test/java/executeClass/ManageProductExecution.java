package executeClass;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.ManageProductPage;


public class ManageProductExecution extends BaseClass {
	ManageProductPage mp;
	LoginPage lp;
	DashboardPage dp;
  @Test(priority = 0)
  public void verifyHeading() {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new DashboardPage(driver);
	  dp.clickManageProduct();
	  mp=new ManageProductPage(driver);
	  
	  String atual= mp.getText();
	  String expected ="List Products";
	  Assert.assertEquals(atual, expected);
	  
  }
  
  @Test(priority = 1)
  public void verifySearchFuntion()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new DashboardPage(driver);
	  dp.clickManageProduct();
	  mp=new ManageProductPage(driver);
	  mp.clickSearch();
	  mp.enterTitleToBeSearched("Maggi Noodle");
	  mp.clickSumitSearch();
	  String atual= mp.searchResult();
	  String expected="Maggi Noodle P833 Combo P835";
	  Assert.assertEquals(atual, expected);
	  
  }
  
  @Test(priority = 2)
  public void verifyResetUnderSearchWillClearSearchResult()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new DashboardPage(driver);
	  dp.clickManageProduct();
	  mp=new ManageProductPage(driver);
	  mp.clickSearch();
	  mp.enterTitleToBeSearched("Maggi Noodle");
	  mp.clickSumitSearch();
	  mp.resetButton();
	  boolean atual=mp.ispage2displayed();
	  Assert.assertTrue(atual);
  }
  
  @Test(priority = 3)
  
  public void verifyDelectFuntionality()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new DashboardPage(driver);
	  dp.clickManageProduct();
	  mp=new ManageProductPage(driver);
	  mp.clickDelect();
	  mp.alertMessage();
	  boolean atual=mp.isDelectMessageDisplayed();
	  Assert.assertTrue(atual);
  }
  
  
  
  
  
}
