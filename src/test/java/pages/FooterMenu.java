package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class FooterMenu {
    public FooterMenu() {
        PageFactory.initElements(GWD.driver,this);
    }
}
