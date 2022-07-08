package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.CheckoutPage;
import starter.pages.LoginPage;

public class CheckoutStepdefs {

    @Steps

    CheckoutPage checkoutPage;
    LoginPage loginPage;
    CartPage cartPage;

    @Given("I see my cart value")
    public void iSeeMyCartValue() {
        loginPage.onPage();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.ClickButtonLogin();
        cartPage.ClickCartOne();
        cartPage.ClickCartTwo();
        cartPage.ClickCartThree();
        checkoutPage.ClickButtonCart();
        checkoutPage.CartView();
    }

    @When("I click button checkout")
    public void iClickButtonCheckout() {
        checkoutPage.ClickButtonCheckout();
    }

    @And("I view checkout information")
    public void iViewCheckoutInformation() {
        checkoutPage.UserViewInformation();
    }

    @And("I Input First Name")
    public void iInputFirstName() {
        checkoutPage.InputFirstName("Agung");
    }

    @And("I Input Last Name")
    public void iInputLastName() {
        checkoutPage.InputLastName("Firmansyah");
    }

    @And("I Input Zip Code")
    public void iInputZipCode() {
        checkoutPage.InputZipcode("10702");
    }

    @And("I click Button Continue")
    public void iClickButtonContinue() {
        checkoutPage.ClickButtonContinue();
    }

    @And("I View checkout Overview")
    public void iViewCheckoutOverview() {
        checkoutPage.ViewCheckoutOverview();
    }

    @And("I click button finish")
    public void iClickButtonFinish() {
        checkoutPage.ClickbuttonFinish();
    }

    @Then("I finish the order")
    public void iFinishTheOrder() {
        checkoutPage.ViewFinishOrder();
    }
}
