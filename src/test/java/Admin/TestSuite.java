package Admin;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.text.DateFormat;

/**
 * Created by Asus on 13/05/2015.
 */
public class TestSuite extends BaseTest {
    String username= "admin";
    String password= "Insoft12";
    @Test
    public void verifyadincanLoginwithvalidcredntials(){
        blib.login(username,password);
        Assert.assertEquals("Welcome Admin",driver.findElement(By.id("welcome")).getText());
        blib.logout();
    }
   @Test
    public void verifyAdmincanAddEmployeeSuccessfully(){
        blib.login(username,password);
        Assert.assertEquals("Welcome Admin",driver.findElement(By.id("welcome")).getText());
        blib.click(By.id("menu_pim_viewPimModule"));
        blib.click(By.id("menu_pim_addEmployee"));
        Assert.assertEquals("Add Employee",driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/h1")).getText());
        driver.findElement(By.id("firstName"));
        blib.enterText(By.id("firstName"),"Rajesh");
        blib.enterText(By.id("lastName"),"Patel");
        blib.click(By.id("chkLogin"));
        blib.enterText(By.id("user_name"),"rajesh07");
        blib.enterText(By.id("user_password"),"rajesh04");
        blib.enterText(By.id("re_password"),"rajesh04");
        blib.selectText(By.id("location"), "ASC_London");
        blib.click(By.id("btnSave"));
       // utils.timeSet();
        blib.logout();
        utils.timeSet();
        blib.login("rajesh07","rajesh04");
        Assert.assertEquals("Welcome Rajesh",driver.findElement(By.id("welcome")).getText());
        blib.logout();




//
    }
}
