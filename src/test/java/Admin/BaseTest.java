package Admin;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Asus on 13/05/2015.
 */
public class BaseTest extends BaseClass {
    BusinessLibrary blib =new BusinessLibrary();
    Utils utils =new Utils();

    @Before
    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.get("http://insoftt.trial47.orangehrmlive.com/");
  //      utils.timeSet();
        utils.windowMax();
    }

   @After
    public  void closeBrowser(){
        driver.quit();
    }

}
