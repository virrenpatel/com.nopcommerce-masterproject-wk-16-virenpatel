package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerSteps {
    @When("^I click on Computer Tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnMenuTab("Computers");
    }

    @Then("^I Verify Computer text$")
    public void iVerifyComputerText() {
        Assert.assertEquals("Computers page not displayed", "Computers",
                new ComputerPage().getPageTitleText());
    }

    @And("^I Click on Desktops link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnSubMenu("Desktops");
    }

    @And("^I verify Desktops text$")
    public void iVerifyDesktopsText() {
        Assert.assertEquals("Desktops page not displayed", "Desktops",
                new DesktopsPage().getPageTitleText());
    }


    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String product) {
        new DesktopsPage().selectProduct(product);
    }

    @And("^I select processor\"([^\"]*)\"$")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("^I click on Add to Cart Button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^I can add product to cart successfully$")
    public void iCanAddProductToCartSuccessfully() {
        Assert.assertEquals("Product does not added to cart","The product has been added to your shopping cart",
                new BuildYourOwnComputerPage().getProductAddedMessage());
    }
}
