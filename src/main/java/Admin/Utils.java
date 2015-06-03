package Admin;

import java.util.concurrent.TimeUnit;

/**
 * Created by Asus on 13/05/2015.
 */
public class Utils extends BaseClass {
    public void timeSet(){
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void windowMax()
    {
        driver.manage().window().maximize();
    }
    public void heloo(){

    }
}
