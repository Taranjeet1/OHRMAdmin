
package Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Asus on 13/05/2015.
 */
public class BusinessLibrary extends BaseClass {
    By usernameField=By.id("txtUsername");
    By paswordField=By.id("txtPassword");
    By welcomemessageField=By.id("welcome");
    By logoutField=By.linkText("Logout");
    By loginfield=By.id("btnLogin");
    Utils utils= new Utils();

    public void click(By tick){
        driver.findElement(tick).click();
    }

    public void enterText(By enter,String txt){
        driver.findElement(enter).clear();
        driver.findElement(enter).sendKeys(txt);
    }


    public void login(String username,String password){
        this.enterText(usernameField,username);
        this.enterText(paswordField,password);
        this.click(loginfield);
    }

    public void logout() {
        this.click(welcomemessageField);
        utils.timeSet();
        this.click(logoutField);
    }

    public void selectText(By ma,String txt){
        Select select = new Select(driver.findElement(ma));
        select.selectByVisibleText(txt);
    }





}
