package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class DialogContent {
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
}
