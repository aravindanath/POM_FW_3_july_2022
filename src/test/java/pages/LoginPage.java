package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.JavaUtils;

import java.util.HashMap;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;


    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginButton;


    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailTextField;


    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordTextField;

    @FindBy(xpath = " //input[@value='Login']")
    WebElement loginBTN;

    HashMap<String, String> lp;


    public void verifyLogin(String tcid){
        lp = JavaUtils.readExcelData("Login",tcid);
        emailTextField.sendKeys(lp.get("USERNAME"));
        passwordTextField.sendKeys(lp.get("PASSWORD"));
        loginBTN.click();
    }
}
