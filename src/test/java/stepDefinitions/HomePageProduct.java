package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;

public class HomePageProduct {
    DialogContent dialogContent=new DialogContent();
    int productDiscount;
    double discountPrice;
    String homepageProductName;

    @When("The user clicks on a random product from the Homepage")
    public void theUserClicksOnARandomProductFromTheHomepage() {
       dialogContent.wait.until(ExpectedConditions.visibilityOf(dialogContent.homePageProductFirst));
       productDiscount=Integer.parseInt(dialogContent.productDiscount.getText().replaceAll("%","").trim());
       dialogContent.scrollToElement(dialogContent.homePageProductFirst);
        homepageProductName=dialogContent.homepageProductFirstName.getText();
       dialogContent.myClick(dialogContent.homePageProductFirst);
    }

    @And("The user clicks on the add to card button")
    public void theUserClicksOnTheAddToCardButton() {
        double oldPrice=Double.parseDouble(dialogContent.productOldPrice.getText().replaceAll("₺","").trim());
        double newPrice=Double.parseDouble(dialogContent.productNewPrice.getText().replaceAll("₺","").trim());

        double discountPercentage = (newPrice / oldPrice) * 100;
        discountPrice=oldPrice * (discountPercentage / 100);
        Assert.assertTrue(newPrice == discountPrice);

        if (newPrice == discountPrice){
            dialogContent.myClick(dialogContent.addToCardBtn);
            dialogContent.wait.until(ExpectedConditions.visibilityOf(dialogContent.addToCardControl));
            dialogContent.verifyContainsText(dialogContent.addToCardControl,"Sepete eklendi");
            dialogContent.myClick(dialogContent.alertCloseBtn);
        }
    }

    @And("The user clicks on the add to card icon from Header menu")
    public void theUserClicksOnTheAddToCardIconFromHeaderMenu() {
        dialogContent.myClick(dialogContent.headerMyAddToCardIcon);
    }

    @Then("The user verifies product in the shopping cart")
    public void theUserVerifiesProductInTheShoppingCart() {
        dialogContent.wait.until(ExpectedConditions.visibilityOf(dialogContent.basketTotalPrice));
        double basketTotalPrice=Double.parseDouble(dialogContent.basketTotalPrice.getText().replaceAll("₺","").trim());
        Assert.assertTrue(basketTotalPrice == discountPrice);
       Assert.assertTrue(homepageProductName.contains(dialogContent.basketProductName.getText()));
    }
}
