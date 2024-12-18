package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;
import utilities.ReusableMethods;

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
