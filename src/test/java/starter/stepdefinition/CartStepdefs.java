package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.LoginPage;

public class CartStepdefs {
    @Steps
    LoginPage loginPage;
    CartPage cartPage;

    @Given("I already in home page")
    public void iAlreadyInHomePage() {
        loginPage.onPage();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.ClickButtonLogin();
    }

    @When("I click add to cart any product")
    public void iClickAddToCartAnyProduct() {
        cartPage.ClickCartOne();
        cartPage.ClickCartTwo();
        cartPage.ClickCartThree();
    }

    @Then("I see my cart added")
    public void iSeeMyCartAdded() {
        cartPage.CartValueView();

    }

}
