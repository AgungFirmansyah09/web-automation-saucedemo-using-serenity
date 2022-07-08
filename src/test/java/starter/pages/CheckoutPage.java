package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {

    private By ButtonCart (){
        return By.xpath("//a[@class='shopping_cart_link']");
    }

    private By ViewCart (){
        return By.xpath("//span[text()='Your Cart']");
    }




    private By buttonCeckout (){
        return By.id("checkout");
    }

    private By ViewInformation(){
        return By.xpath("//span[text()='Checkout: Your Information']");
    }

    private By FirstName(){
        return By.id("first-name");
    }

    private By LastName(){
        return By.id("last-name");
    }

    private By ZipCode(){
        return By.id("postal-code");
    }

    private By ButtonContinue(){
        return By.id("continue");
    }

    private By Overview (){
        return By.xpath("//span[text()='Checkout: Overview']");
    }

    private By buttonFinish(){
        return By.id("finish");
    }

    private By FinishOrder(){
        return By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");
    }


//  Step Desctiption

    @Step
    public void ClickButtonCart(){
        $(ButtonCart()).click();
    }

    @Step
    public void CartView(){
        $(ViewCart()).waitUntilVisible().isDisplayed();
    }



    @Step
    public void ClickButtonCheckout(){
        $(buttonCeckout()).click();
    }

    @Step
    public void UserViewInformation(){
        $(ViewInformation()).waitUntilVisible().isDisplayed();
    }

    @Step
    public void InputFirstName (String firtname){
        $(FirstName()).type(firtname);
    }

    @Step
    public void InputLastName (String lastname){
        $(LastName()).type(lastname);
    }

    @Step
    public void InputZipcode (String zipcode){
        $(ZipCode()).type(zipcode);
    }

    @Step
    public void ClickButtonContinue (){
        $(ButtonContinue()).click();
    }

    @Step
    public void ViewCheckoutOverview (){
        $(Overview()).isDisplayed();
    }

    @Step
    public void ClickbuttonFinish(){
        $(buttonFinish()).click();
    }

    @Step
    public void ViewFinishOrder(){
        $(FinishOrder()).waitUntilVisible().isDisplayed();
    }

}
