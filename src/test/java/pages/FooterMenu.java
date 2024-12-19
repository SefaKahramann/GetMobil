package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;
import utilities.ReusableMethods;

import java.util.List;

public class FooterMenu extends ReusableMethods {
    public FooterMenu() {
        PageFactory.initElements(GWD.driver,this);
    }

    @FindBy(css = "a[class='GMLink']")
    public List<WebElement> footerMenu;
}
