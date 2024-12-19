package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import pages.TopNav;
import utilities.ConfigReader;
import utilities.GWD;

import java.util.List;

public class HeaderMenu {
    TopNav topNav = new TopNav();
    DialogContent dialogContent = new DialogContent();

    @When("The user views the buttons in the Header Menu")
    public void theUserViewsTheButtonsInTheHeaderMenu() {
        topNav.wait.until(ExpectedConditions.visibilityOfAllElements(topNav.headerMenuVerifies));
        Assert.assertTrue(topNav.headerMenuVerifies.isDisplayed());
    }

    @And("The user hovers over the Mobile Phone button views the products and clicks")
    public void theUserHoversOverTheMobilePhoneButtonViewsTheProductsAndClicks() {
        List<WebElement> mobilePhones = topNav.productList;

        topNav.hoverOver(topNav.phoneBtn);
        topNav.wait.until(ExpectedConditions.visibilityOfAllElements(topNav.productList));

        for (WebElement phone : mobilePhones) {
            Assert.assertTrue(phone.isDisplayed());
        }
    }

    @Then("The user clicks the Sell Phone button and verifies they are redirected to the page")
    public void theUserClicksTheSellPhoneButtonAndVerifiesTheyAreRedirectedToThePage() {
        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.buyBackBtn));
        topNav.myClick(topNav.buyBackBtn);
        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.pageVerify));
        topNav.verifyContainsText(topNav.pageVerify, "Telefon Sat");
    }

    @When("The user clicks the Store button and verifies they are redirected to the page")
    public void theUserClicksTheStoreButtonAndVerifiesTheyAreRedirectedToThePage() {
        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.storesBtn));
        topNav.myClick(topNav.storesBtn);
        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.pageVerify));
        topNav.verifyContainsText(topNav.pageVerify, "Mağazalarımız");
    }

    @And("The user clicks the Franchise button and verifies they are redirected to the page")
    public void theUserClicksTheFranchiseButtonAndVerifiesTheyAreRedirectedToThePage() {
        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.franchisesBtn));
        topNav.myClick(topNav.franchisesBtn);
        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.pageVerify));
        topNav.verifyContainsText(topNav.pageVerify, "Bayilik");
    }

    @When("The user clicks on the Device Search field and views the products")
    public void theUserClicksOnTheDeviceSearchFieldAndViewsTheProducts() {
        List<WebElement> searchProducts = topNav.phoneName;

        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.searchBox));
        topNav.myClick(topNav.searchBox);
        topNav.wait.until(ExpectedConditions.visibilityOfAllElements(topNav.phoneName));

        for (WebElement phones : searchProducts) {
            Assert.assertTrue(phones.isDisplayed());
        }
    }

    @And("The user clicks the My Cart button and is redirected to the cart page")
    public void theUserClicksTheMyCartButtonAndIsRedirectedToTheCartPage() {
        dialogContent.wait.until(ExpectedConditions.visibilityOf(dialogContent.headerMyAddToCardIcon));
        dialogContent.myClick(dialogContent.headerMyAddToCardIcon);
        dialogContent.wait.until(ExpectedConditions.visibilityOf(dialogContent.basketPageVerify));
        dialogContent.verifyContainsText(dialogContent.basketPageVerify, "Sepeti İncele");
    }

    @Then("The user clicks the Getmobil logo and reaches the homepage")
    public void theUserClicksTheGetmobilLogoAndReachesTheHomepage() {
        topNav.wait.until(ExpectedConditions.visibilityOf(topNav.backBtn));
        topNav.myClick(topNav.backBtn);
        topNav.myClick(topNav.logoBtn);
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(ConfigReader.getProperty("URL")));
    }
}