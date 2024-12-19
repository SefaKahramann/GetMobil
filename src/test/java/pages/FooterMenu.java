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

    @FindBy(xpath = "(//div[@class='container-fluid container-xl'])[1]")
    public WebElement scrollFooter;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[2]//a")
    public List<WebElement>brands;

    @FindBy(xpath = "//div[@class='category-container__title']/h1")
    public WebElement categories;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[3]//a")
    public List<WebElement>apple;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[4]//a")
    public List<WebElement>samsung;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[5]//a")
    public List<WebElement>huawei;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[6]//a")
    public List<WebElement>renewedPhone;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[7]//a")
    public List<WebElement>soldPhone;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[8]//a")
    public List<WebElement>company;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[9]//a")
    public List<WebElement>application;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[10]//a")
    public List<WebElement>lawful;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[11]//a")
    public List<WebElement>other;

    @FindBy(xpath = "((//div[@class='row'])[1]//div[@class='footer-kategori'])[12]//a")
    public List<WebElement>support;

}
