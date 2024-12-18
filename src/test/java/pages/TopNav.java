package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;
import utilities.ReusableMethods;

import java.util.ResourceBundle;


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
}
