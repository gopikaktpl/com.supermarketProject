package executeClass;

import org.testng.annotations.Test;
import elementRepository.LoginPage;
import java.io.IOException;
import org.testng.Assert;


public class LogInPageExecution extends BaseClass{
	

	LoginPage lp;
  @Test(priority = 1)
  public void verifySuccessfulLogin() throws IOException {
	  lp =new LoginPage(driver);
	  lp.enterUsername(lp.readUsername(1,0));
	  lp.enterPassword(lp.readPassword(1,1));
	  lp.clickSignInButton();
	  String expected="http://groceryapp.uniqassosiates.com/admin";
	  String actual= driver.getCurrentUrl();
	  Assert.assertEquals(actual, expected);
  }
  
  @Test(priority = 0)
  
  public void isRememberMeCheckboxEnabledAfterClick()
  {
	  lp =new LoginPage(driver);
	  lp.clickRememberMeCheckBox();
	  boolean status=lp.rememberMeCheckBoxEnabled();
	  Assert.assertTrue(status);
	  
  }

  @Test(priority = 2)
  public void verifySLoginWithInvalidUsernameAndPassword() throws IOException {
	  lp =new LoginPage(driver);
	  lp.enterUsername(lp.readUsername(3,0));
	  lp.enterPassword(lp.readPassword(3,1));
	  lp.clickSignInButton();
	  boolean atual=lp.isalertMessagePresent();
	  Assert.assertTrue(atual);
	  
  }
  @Test(dataProvider="data-provider",dataProviderClass=DataProviderClass.class)
  public void verifyUnsuccessfulLogin(String uname,String passwd)
  {
	  lp =new LoginPage(driver);
	  lp.enterUsername(uname);
	  lp.enterPassword(passwd);
	  lp.clickSignInButton();
	  String expected="http://groceryapp.uniqassosiates.com/admin";
	  String actual= driver.getCurrentUrl();
	  Assert.assertEquals(actual, expected);
  }

}
