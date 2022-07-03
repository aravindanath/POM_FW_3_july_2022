package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

// Object Repo

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountButton;

    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerButton;

    @FindBy(id = "input-firstname")
    WebElement firstNameTextField;

    @FindBy(id = "input-lastname")
    WebElement lastNameTextField;

    @FindBy(id = "input-email")
    WebElement emailTextField;

    @FindBy(id = "input-telephone")
    WebElement telephoneTextField;

    @FindBy(id = "input-password")
    WebElement passwordTextField;

    @FindBy(id = "input-confirm")
    WebElement confirmPasswordTextField;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement agreeCheckbox;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;



    public void navigateToRegisterPage(){
        myAccountButton.click();
        registerButton.click();
    }

    public void enterMandatoryField(String firstName, String lastName, String email, String tel, String password, String confimPass){

        firstNameTextField.sendKeys(firstName);
        lastNameTextField.sendKeys(lastName);
        emailTextField.sendKeys(email);
        telephoneTextField.sendKeys(tel);
        passwordTextField.sendKeys(password);
        confirmPasswordTextField.sendKeys(confimPass);
        waitforElementVisible(driver,30,agreeCheckbox);
        agreeCheckbox.click();

    }

    public void submit(){
        waitElement(5000);
        continueButton.click();
    }







}
