package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CartPage extends PageObject {


    private By CartOne(){
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    private By CartTwo(){
        return By.id("add-to-cart-sauce-labs-bike-light");
    }

    private By CartThree(){
        return By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    }

    private By CartValue(){
        return By.xpath("//span[@class='shopping_cart_badge']");
    }


    @Step
    public void onPage(){
        open();
    }

    @Step
    public void ClickCartOne(){
        $(CartOne()).click();
    }

    @Step
    public void ClickCartTwo(){
        $(CartTwo()).click();
    }

    @Step
    public void ClickCartThree(){
        $(CartThree()).click();
    }

    @Step
    public void CartValueView(){
        $(CartValue()).waitUntilVisible().isDisplayed();
    }

}
