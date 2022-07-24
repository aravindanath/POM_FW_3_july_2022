package testScripts.Login;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.RegisterPage;
import testScripts.BaseTest;

public class TC_RF_002 extends BaseTest {

    /**
     * @author: Aravind
     * TC_RF_001: Validate Registering an Account by providing only the Mandatory fields
     *
     */


    @Test
    public void TC_RF_002(){

       // String  userName = BasePage.getValue("TC_RF_002","eamil"),password=BasePage.getValue("TC_RF_002","password");

        RegisterPage rp = new RegisterPage(driver);
        rp.navigateToLoginPage();
        LoginPage lp = new LoginPage(driver);
        lp.verifyLogin("TC_RF_002");
    }

}
