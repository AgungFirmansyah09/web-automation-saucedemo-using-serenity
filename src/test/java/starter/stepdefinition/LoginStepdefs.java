package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;


public class LoginStepdefs {

    @Steps
    LoginPage loginPage;

    @Given("I Open saucedemo Login Page")
    public void iOpenSaucedemoLoginPage() {
        loginPage.onPage();
        loginPage.ValidationLogin();
    }

    @When("I Input valid username")
    public void iInputValidUsername() {
        loginPage.inputUsername("standard_user");
    }

    @And("I Input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("I Click button login")
    public void iClickButtonLogin() {
        loginPage.ClickButtonLogin();
    }

    @Then("I can see my home page")
    public void iCanSeeMyHomePage() {
        loginPage.ValidaitonHomePage();
    }

    @When("I input wrong username")
    public void iInputWrongUsername() {
        loginPage.inputWrongUsername("lock_out_user");
    }


    @Then("I can see error message")
    public void iCanSeeErrorMessage() {
        loginPage.ErroMessage();
    }
}
