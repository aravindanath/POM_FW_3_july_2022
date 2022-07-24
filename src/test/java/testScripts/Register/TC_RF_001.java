package testScripts.Register;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.RegisterPage;
import testScripts.BaseTest;

public class TC_RF_001 extends BaseTest {

    /**
     * @author: Aravind
     * TC_RF_001: Validate Registering an Account by providing only the Mandatory fields
     *
     */


    @Test
    public void TC_RF_001(){

        String fn = BasePage.getFirstName(),
                ln = BasePage.getLastName(),
                email = BasePage.getEmail(),
                mobile =  BasePage.getMobileNumber();


        RegisterPage rp = new RegisterPage(driver);
        rp.navigateToRegisterPage();
        rp.enterMandatoryField(fn,ln,email,mobile,fn,fn);
        rp.submit();

    }

}
