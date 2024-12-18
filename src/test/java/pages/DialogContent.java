package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class DialogContent {
    public DialogContent() {
        PageFactory.initElements(GWD.driver,this);
    }
}
