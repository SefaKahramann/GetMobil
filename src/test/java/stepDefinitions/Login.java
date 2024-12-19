package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.DialogContent;
import pages.TopNav;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Login {
    TopNav topNav =new TopNav();
    DialogContent dialogContent =new DialogContent();

    @Given("The user navigate to Getmobil")
    public void theUserNavigateToGetmobil() {
        GWD.getDriver().get(ConfigReader.getProperty("URL"));
    }

    @When("The user clicks on the Login button and types phone number")
    public void theUserTypesPhoneNumber() {
        topNav.myClick(topNav.loginBtn);

        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.inputPhoneNumber));
        topNav.mySendKeys(topNav.inputPhoneNumber, "5330407395");
        topNav.myClick(topNav.continueBtn);
    }

    @Then("The user verifies login successfully")
    public void theUserVerifiesLoginSuccessfully() {
        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.longinControl));
        topNav.verifyContainsText(topNav.longinControl, "Giriş Yaptınız");
        dialogContent.myClick(dialogContent.alertCloseBtn);
    }

    @Given("The user hovers over the Profile button and displays profile dropdown menu")
    public void theUserHoversoverTheProfileButtonAndDisplaysProfileDropdownMenu() {
        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.profileBtn));
        topNav.hoverOver(topNav.profileBtn);
        dialogContent.wait.until(ExpectedConditions.visibilityOf(dialogContent.orderBtn));
    }

    @When("The user clicks on the Orders button")
    public void theUserClicksOnTheOrdersButton() {
        dialogContent.myClick(dialogContent.orderBtn);
        dialogContent.wait.until(ExpectedConditions.urlContains("aldiklarim"));
    }

    @Then("The user clicks on the Left nav elements and verifies each options")
    public void theUserClicksOnTheLeftnavElementsAndVerifiesEachOptions(DataTable dtBtn) {
        List<String> links=new ArrayList<>();
        Collections.addAll(links,"sattiklarim","begendiklerim","kullanici-bilgilerim","iletisim-izinlerim","adreslerim");

        List<String> buttons=dtBtn.asList(String.class);
        for (int i = 0; i < buttons.size(); i++) {
            dialogContent.myClick(dialogContent.getWebElement(buttons.get(i)));
            dialogContent.wait.until(ExpectedConditions.urlContains(links.get(i)));
            dialogContent.wait.until(ExpectedConditions
                    .visibilityOfAllElements(dialogContent.getWebElement(buttons.get(i))));
        }
    }
}
