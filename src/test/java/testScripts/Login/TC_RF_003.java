package testScripts.Login;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.RegisterPage;
import testScripts.BaseTest;

public class TC_RF_003 extends BaseTest {

    /**
     * @author: Aravind
     * TC_RF_001: Validate Registering an Account by providing only the Mandatory fields
     *
     */


    @Test
    public void TC_RF_003(){


        RegisterPage rp = new RegisterPage(driver);
        rp.navigateToLoginPage();
        LoginPage lp = new LoginPage(driver);
        lp.verifyLogin("TC_RF_003");
    }

}
