package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class FooterMenu {
    public FooterMenu() {
        PageFactory.initElements(GWD.driver,this);
    }

    @FindBy(css = "a[class='GMLink']")
    public List<WebElement> footerMenu;
}
