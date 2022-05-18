package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;


import elementRepository.DashboardPage;
import elementRepository.ExpenceCategoryPage;
import elementRepository.LoginPage;

public class ExpenceCategoryPageExecution extends BaseClass{
	  ExpenceCategoryPage ecp;
	  LoginPage lp;
	  DashboardPage dp;
  @Test(priority = 0)
  public void verifyHeading() {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new DashboardPage(driver);
	  dp.clickOnManageExpence();
	  dp.enableExpenceCategory();
	  ecp= new ExpenceCategoryPage(driver);
	  String atual=ecp.getHeading();
	  String expected="Expense Category";
	  Assert.assertEquals(atual, expected);
  }
  
  @Test(priority =1)
  public void addNewexpenceCategory()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp= new DashboardPage(driver);
	  dp.clickOnManageExpence();
	  dp.enableExpenceCategory();
	  ecp= new ExpenceCategoryPage(driver);
	  ecp.clickNew();
	  ecp.enteNew("book");
	  ecp.clickSave();
	  boolean atual=ecp.successfulMessageIsPresent();
	  Assert.assertTrue(atual);
	  
  }
}
