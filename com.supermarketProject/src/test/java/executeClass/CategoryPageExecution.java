package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.CategoryPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;


public class CategoryPageExecution extends BaseClass {
	  CategoryPage cp;
	  LoginPage lp;
	  DashboardPage dp;
  @Test(priority = 0)
  public void verifyPageHeading() {
	
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickCategory();
	  cp=new CategoryPage(driver);
	  String atual=cp.getHeading();
	  String expected="List Categories";
	  Assert.assertEquals(atual, expected);
	  
  }
  @Test(priority=1)
  
  public void verifySearchFunction()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickCategory();
	  cp=new CategoryPage(driver);
	  cp.clickSearch();
	  cp.enterCategoryValueToBeTested("seafood");
	  cp.clickSearchSubmit();
	  String atual=cp.getSearchResult();
	  String expected= "seafood";
	  Assert.assertEquals(atual, expected);
  }
  
  @Test(priority = 2)
  public void addNewCategory()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickCategory();
	  cp=new CategoryPage(driver);
	  cp.clicknew();
	  cp.enterNewCategory("book");
	  cp.selectgroup();
	  cp.clicksave();
	  boolean atual=cp.SuccessfullMeassage();
	  Assert.assertTrue(atual);
  }
  
  @Test(priority = 3)
  public void verifyCancelOnAddCategoryPageCloseThePage()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickCategory();
	  cp=new CategoryPage(driver);
	  cp.clicknew();
	  cp.clickCancel();
	  boolean atual=cp.enterCategoryInfopresent();
	  Assert.assertFalse(atual);
  }
  
  @Test(priority = 4)
  public void verifyDelectFunction()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickCategory();
	  cp=new CategoryPage(driver);
	  cp.clickDelect();
	  cp.alert();
	  boolean atual=cp.isDelectMessagePresent();
	  Assert.assertTrue(atual);
  }
}
