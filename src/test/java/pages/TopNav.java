package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;
import utilities.ReusableMethods;

import java.util.List;

public class TopNav extends ReusableMethods {
    public TopNav() {
        PageFactory.initElements(GWD.driver,this);
    }

    @FindBy(xpath = "//div[text()='GİRİŞ YAP']")
    public WebElement loginBtn;

    @FindBy(css = "input[class='form-control ']")
    public WebElement inputPhoneNumber;

    @FindBy(xpath = "//div[contains(text(),'Giriş Yaptınız')]")
    public WebElement longinControl;

    @FindBy(css = "button[data-testid='login-modal__continue-button']")
    public WebElement continueBtn;

    @FindBy(css = "[class='profilDropdownText ipad-hidden']")
    public WebElement profileBtn;

    @FindBy(css = "[class='GetmobilDesktopLogoContainer']")
    public WebElement logoBtn;

    @FindBy(css = "[class='profilDropdownText']")
    public WebElement phoneBtn;

    @FindBy(css = "[data-testid='header__buyback']")
    public WebElement buyBackBtn;

    @FindBy(css = "[data-testid='header__stores']")
    public WebElement storesBtn;

    @FindBy(css = "[data-testid='header__franchises']")
    public WebElement franchisesBtn;

    @FindBy(css = "[li-type='mobilPhoneDropdownTextItem']")
    public List<WebElement> productList;

    @FindBy(css = "input[class='header-search-input']")
    public WebElement searchBox;

    @FindBy(css = "span[data-testid='search-list-phone-name']")
    public List<WebElement> phoneName;

    @FindBy(css = "span[class='breadcrumbs-links']")
    public WebElement pageVerify;

    @FindBy(xpath = "//a[contains(@class,'MenuItemDesktopText')]")
    public WebElement headerMenuVerifies;

    @FindBy(xpath = "//div[@class='customBasketHeader']//i")
    public WebElement backBtn;
}
