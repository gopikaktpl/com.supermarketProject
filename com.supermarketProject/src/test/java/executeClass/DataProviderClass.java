package executeClass;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
  @DataProvider(name="data-provider")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "admin", "admin12" },
      new Object[] { "admin123", "admin" },
      new Object[] {"admin1234","admin1"}
    };
  }
}
