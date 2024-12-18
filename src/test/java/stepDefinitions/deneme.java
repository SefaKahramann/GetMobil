package stepDefinitions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.TopNav;
import utilities.ConfigReader;
import utilities.GWD;

public class deneme {
    TopNav element=new TopNav();

    @Test
    public void Test1(){
        GWD.driver.get(ConfigReader.getProperty("URL"));

        element.myClick(element.loginBtn);
        element.wait.until(ExpectedConditions.visibilityOf(element.inputPhoneNumber));

        element.mySendKeys(element.inputPhoneNumber,"5330407395");
        element.wait.until(ExpectedConditions.visibilityOf(element.continueBtn));
        element.myClick(element.continueBtn);

        element.wait.until(ExpectedConditions.visibilityOf(element.longinControl));


    }
}
