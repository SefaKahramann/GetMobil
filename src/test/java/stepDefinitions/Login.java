package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.DialogContent;
import pages.TopNav;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Login {
    TopNav topNavElement=new TopNav();
    DialogContent dialogContentElement=new DialogContent();

    @Given("The user navigate to Getmobil")
    public void theUserNavigateToGetmobil() {
        GWD.getDriver().get(ConfigReader.getProperty("URL"));
    }

    @When("The user clicks on the Login button and types phone number")
    public void theUserTypesPhoneNumber() {
        topNavElement.myClick(topNavElement.loginBtn);

        topNavElement.wait.until(ExpectedConditions.visibilityOf(topNavElement.inputPhoneNumber));
        topNavElement.mySendKeys(topNavElement.inputPhoneNumber, "5330407395");
        topNavElement.myClick(topNavElement.continueBtn);
    }

    @Then("The user verifies login successfully")
    public void theUserVerifiesLoginSuccessfully() {
        topNavElement.wait.until(ExpectedConditions.visibilityOf(topNavElement.longinControl));
        topNavElement.verifyContainsText(topNavElement.longinControl, "Giriş Yaptınız");
        dialogContentElement.myClick(dialogContentElement.alertCloseBtn);
    }

    @Given("The user hovers over the Profile button and displays profile dropdown menu")
    public void theUserHoversoverTheProfileButtonAndDisplaysProfileDropdownMenu() {
        topNavElement.wait.until(ExpectedConditions.visibilityOf(topNavElement.profileBtn));
        topNavElement.hoverOver(topNavElement.profileBtn);
        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(dialogContentElement.orderBtn));
    }

    @When("The user clicks on the Orders button")
    public void theUserClicksOnTheOrdersButton() {
        dialogContentElement.myClick(dialogContentElement.orderBtn);
        dialogContentElement.wait.until(ExpectedConditions.urlContains("aldiklarim"));
    }

    @Then("The user clicks on the Left nav elements and verifies each options")
    public void theUserClicksOnTheLeftnavElementsAndVerifiesEachOptions(DataTable dtBtn) {
        List<String> links=new ArrayList<>();
        Collections.addAll(links,"sattiklarim","begendiklerim","kullanici-bilgilerim","iletisim-izinlerim","adreslerim");

        List<String> buttons=dtBtn.asList(String.class);
        for (int i = 0; i < buttons.size(); i++) {
            dialogContentElement.myClick(dialogContentElement.getWebElement(buttons.get(i)));
            dialogContentElement.wait.until(ExpectedConditions.urlContains(links.get(i)));
            dialogContentElement.wait.until(ExpectedConditions
                    .visibilityOfAllElements(dialogContentElement.getWebElement(buttons.get(i))));
        }
    }
}
