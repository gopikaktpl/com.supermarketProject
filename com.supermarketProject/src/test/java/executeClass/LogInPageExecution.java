package executeClass;

import org.testng.annotations.Test;

import elementRepository.LoginPage;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

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
  
  
}
