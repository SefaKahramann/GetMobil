package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.FooterMenu;
import pages.TopNav;
import utilities.GWD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FooterMenuFunc {
    FooterMenu footerMenu = new FooterMenu();
    TopNav topNav=new TopNav();

    @Given("The user scrolls to Footer Menu")
    public void theUserScrollsToFooterMenu() {
        footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.scrollFooter));
        footerMenu.scrollToElement(footerMenu.scrollFooter);
        Assert.assertTrue(footerMenu.scrollFooter.isDisplayed());
    }

    @Then("The user verifies all links in the Footer menu by clicking on all buttons")
    public void theUserVerifiesAllLinksInTheFooterMenuByClickingOnAllButtons() {

        footerMenu.wait.until(ExpectedConditions.visibilityOf(footerMenu.renewedPhoneLink));
        footerMenu.jsClick(footerMenu.renewedPhoneLink);
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("cep-telefonu"));
        GWD.getDriver().navigate().back();
        footerMenu.scrollToElement(footerMenu.renewedPhoneLink);

        List<String> brands = new ArrayList<>();
        for (int i = 0; i < footerMenu.brands.size(); i++) {
            Collections.addAll(brands, footerMenu.brands.get(i).getText());
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.brands.get(i)));
            footerMenu.jsClick(footerMenu.brands.get(i));
            footerMenu.wait.until(ExpectedConditions.urlContains(brands.get(i).toLowerCase()));
            Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(brands.get(i).toLowerCase()));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.brands.get(i));
        }

        List<String> apple = new ArrayList<>();
        for (int i = 0; i < footerMenu.apple.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.apple.get(i)));
            footerMenu.jsClick(footerMenu.apple.get(i));
            Collections.addAll(apple,footerMenu.categories.getText());
            footerMenu.wait.until(ExpectedConditions.visibilityOf(footerMenu.categories));
            Assert.assertTrue(footerMenu.categories.getText().contains(apple.get(i)));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.apple.get(i));
        }

        List<String> samsung = new ArrayList<>();
        for (int i = 0; i < footerMenu.samsung.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.samsung.get(i)));
            footerMenu.jsClick(footerMenu.samsung.get(i));
            Collections.addAll(samsung,footerMenu.categories.getText());
            footerMenu.wait.until(ExpectedConditions.visibilityOf(footerMenu.categories));
            Assert.assertTrue(footerMenu.categories.getText().contains(samsung.get(i)));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.samsung.get(i));
        }

        List<String> huawei = new ArrayList<>();
        for (int i = 0; i < footerMenu.huawei.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.huawei.get(i)));
            footerMenu.jsClick(footerMenu.huawei.get(i));
            Collections.addAll(huawei,footerMenu.categories.getText());
            footerMenu.wait.until(ExpectedConditions.visibilityOf(footerMenu.categories));
            Assert.assertTrue(footerMenu.categories.getText().contains(huawei.get(i)));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.huawei.get(i));
        }

        List<String> renewedPhone = new ArrayList<>();
        for (int i = 0; i < footerMenu.renewedPhone.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.renewedPhone.get(i)));
            footerMenu.jsClick(footerMenu.renewedPhone.get(i));
            Collections.addAll(renewedPhone,footerMenu.categories.getText());
            footerMenu.wait.until(ExpectedConditions.visibilityOf(footerMenu.categories));
            Assert.assertTrue(footerMenu.categories.getText().contains(renewedPhone.get(i)));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.renewedPhone.get(i));
        }

        for (int i = 0; i < footerMenu.soldPhone.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.soldPhone.get(i)));
            footerMenu.jsClick(footerMenu.soldPhone.get(i));
            footerMenu.wait.until(ExpectedConditions.urlContains("sat"));
            Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("sat"));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.soldPhone.get(i));
        }

        List<String> company = new ArrayList<>();
        Collections.addAll(company, "hakkimizda","belgelerimiz","magazalarimiz","getmobil-guvenilir-mi");
        for (int i = 0; i < footerMenu.company.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.company.get(i)));
            footerMenu.jsClick(footerMenu.company.get(i));
            footerMenu.wait.until(ExpectedConditions.urlContains(company.get(i).toLowerCase()));
            Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(company.get(i).toLowerCase()));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.company.get(i));
        }

        List<String> application = new ArrayList<>();
        Collections.addAll(application,"bayilik","bayilik","bayilik","kariyer");
        for (int i = 0; i < footerMenu.application.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.application.get(i)));
            footerMenu.jsClick(footerMenu.application.get(i));
            footerMenu.wait.until(ExpectedConditions.urlContains(application.get(i).toLowerCase()));
            Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(application.get(i).toLowerCase()));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.application.get(i));
        }

        List<String> lawful = new ArrayList<>();
        Collections.addAll(lawful,"uyelik-sozlesmesi","cihaz-alim-sozlesmesi","mesafeli-satis-sozlesmesi",
                "gizlilik-politikasi","cerez-politikasi" );

        for (int i = 0; i < footerMenu.lawful.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.lawful.get(i)));
            footerMenu.jsClick(footerMenu.lawful.get(i));
            footerMenu.wait.until(ExpectedConditions.urlContains(lawful.get(i).toLowerCase()));
            Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(lawful.get(i).toLowerCase()));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.lawful.get(i));
        }

        List<String> other = new ArrayList<>();
        Collections.addAll(other,"kullanim-kosullari","garanti-kosullari","aydinlatma-metni",
                "acik-riza-metni","on-bilgilendirme-formu","blog","giris-yap" );

        for (int i = 0; i < footerMenu.other.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.other.get(i)));
            footerMenu.jsClick(footerMenu.other.get(i));
            footerMenu.wait.until(ExpectedConditions.urlContains(other.get(i).toLowerCase()));
            Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(other.get(i).toLowerCase()));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.other.get(i));
        }

        List<String> support = new ArrayList<>();
        Collections.addAll(support,"sikca-sorulan-sorular","kozmetik-durumu","bize-ulasin",
                "sikayet");

        for (int i = 0; i < footerMenu.support.size(); i++) {
            footerMenu.wait.until(ExpectedConditions.visibilityOfAllElements(footerMenu.support.get(i)));
            footerMenu.jsClick(footerMenu.support.get(i));
            footerMenu.wait.until(ExpectedConditions.urlContains(support.get(i).toLowerCase()));
            Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains(support.get(i).toLowerCase()));
            GWD.getDriver().navigate().back();
            footerMenu.scrollToElement(footerMenu.support.get(i));
        }
    }
}
