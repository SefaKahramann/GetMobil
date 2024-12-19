package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;
import utilities.ReusableMethods;

import java.util.List;

public class DialogContent extends ReusableMethods {
    public DialogContent() {
        PageFactory.initElements(GWD.driver,this);
    }

    @FindBy(xpath = "//div[text()='Siparişlerim']")
    public WebElement orderBtn;

    @FindBy(xpath = "//div[text()='Sattıklarım']")
    public WebElement mySoldBtn;

    @FindBy(xpath = "//div[text()='Beğendiklerim']")
    public WebElement favoriteBtn;

    @FindBy(xpath = "//div[text()='Kullanıcı Bilgilerim']")
    public WebElement userDetailsBtn;

    @FindBy(xpath = "//div[text()='İletişim İzinlerim']")
    public WebElement  permissionsBtn;

    @FindBy(xpath = "//div[text()='Adres Bilgilerim']")
    public WebElement addressDetailsBtn;

    @FindBy(xpath = "//div[@role='alert']//button")
    public WebElement alertCloseBtn;

    @FindBy(xpath = "(//div[@class='product-card__top aspect-desktop'])[1]")
    public WebElement homePageProductFirst;

    @FindBy(xpath = "(//div[@class='mantine-Text-root mantine-gursce'])[1]")
    public WebElement homepageProductFirstName;

    @FindBy(css = "[data-testid='product-detail__sell-base-price']")
    public WebElement productOldPrice;

    @FindBy(css = "[data-testid='product-detail__price']")
    public WebElement productNewPrice;

    @FindBy(css = "[data-testid='product-detail__add-to-cart-desktop-button']")
    public WebElement addToCardBtn;

    @FindBy(xpath = "//div[text()='Sepete eklendi']")
    public WebElement addToCardControl;

    @FindBy(css = "[data-testid='header__my-basket']")
    public WebElement headerMyAddToCardIcon;

    @FindBy(css = "[data-testid='basket__total-price']")
    public WebElement basketTotalPrice;

    @FindBy(xpath = "//div[contains(@class,'mantine-Text-root fz-big')]")
    public WebElement basketProductName;

    @FindBy(css = "[class='product-card__discount']")
    public WebElement productDiscount;

    public WebElement getWebElement(String strElementName) {

        switch (strElementName) {
            case "mySold": return this.mySoldBtn;
            case "favorite": return this.favoriteBtn;
            case "userDetails": return this.userDetailsBtn;
            case "permissions": return this.permissionsBtn;
            case "addressDetails": return this.addressDetailsBtn;
        }
        return null;
    }
}
