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
	  
  }
}
