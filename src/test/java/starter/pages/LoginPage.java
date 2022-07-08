package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By usernameField(){
        return By.id("user-name");
    }

    private By wrongusernameField(){
        return By.id("user-name");
    }

    private By passwordField(){
        return By.xpath("//input[@id='password']");
    }

    private By loginButton(){
        return By.id("login-button");
    }

    private By Homepage(){
        return By.xpath("//span[text()='Products']");
    }

    private By ErrorMessage(){
        return By.xpath("//h3[@data-test='error']");
    }

    @Step
    public void onPage(){
        open();
    }

    @Step
    public boolean ValidationLogin (){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputWrongUsername(String wrongUsername){
        $(wrongusernameField()).type(wrongUsername);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void ClickButtonLogin(){
        $(loginButton()).click();
    }

    @Step
    public void ValidaitonHomePage(){
        $(Homepage()).isDisplayed();
    }

    @Step
    public void ErroMessage(){
        $(ErrorMessage()).isDisplayed();
    }




}
