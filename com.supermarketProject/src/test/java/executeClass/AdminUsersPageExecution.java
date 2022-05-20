package executeClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.AdminUsersPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class AdminUsersPageExecution extends BaseClass {
	AdminUsersPage ap;
	LoginPage lp;
	DashboardPage dp;
	
  @Test(priority = 0)
  public void verifyThePageHeading() 
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickadminUsers();
	  ap=new AdminUsersPage(driver);
	  String atual=ap.getHeading();
	  String expected="Admin Users";
	  Assert.assertEquals(atual, expected);
  }
  
  @Test(priority = 1)
  public void verifyNewUseraddedOrNot()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickadminUsers();
	  ap=new AdminUsersPage(driver);
	  ap.waitNewUser();
	  ap.clickNew();
	  ap.enterUsername("gopika");
	  ap.enterpassword("gopikaktpl");
	  ap.selectUserType(4);
	  ap.clickSave();
	  boolean atual=ap.isDisplayed();
	  Assert.assertTrue(atual);
  }

  @Test(priority = 2)
  public void verifyDelectUserFuctionalty()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickadminUsers();
	  ap=new AdminUsersPage(driver);
	  ap.clickDelect();
	  ap.alert();
	  boolean atual=ap.delectMessageDisplayed();
	  Assert.assertTrue(atual);
  }
  
  @Test(priority = 3)
  public void verifySearchWithUsername()
  { 
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickadminUsers();
	  ap=new AdminUsersPage(driver);
	  ap.clickSearch();
	  ap.enterUsernameToBeSearched("Robert");
	  ap.clickSearchSubmit();
	  String atual=ap.searchResult();
	  String expected="Robert";
	  Assert.assertEquals(atual, expected);
  }
  
  @Test(priority = 4)
  public void isPage2SelectedByClickingNextPage()
  {
	  lp=new LoginPage(driver);
	  lp.enterUsername("admin");
	  lp.enterPassword("admin");
	  lp.clickSignInButton();
	  dp=new DashboardPage(driver);
	  dp.clickadminUsers();
	  ap=new AdminUsersPage(driver);
	  ap.clickHome();
	  String atual=ap.getHomeURL();
	  String expect="http://groceryapp.uniqassosiates.com/admin/home";
	  Assert.assertEquals(atual, expect);
	    
  }
}