package Pages;

import Contants.LoginPageContants;
import Contants.SearchPageContants;
import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class LoginPage extends BasePage implements LoginPageContants {

    private final Logger LOGGER = LogManager.getLogger(LoginPage.class);
    String email="asli.026@hotmail.com";
    String password="a4s3l2i1.";




    public void singIn() throws InterruptedException{

        waitForElementAndClick(login);
        waitForElementAndClick(loginbutton);
        waitForElementAndSendKeys(emailInput,email);
        waitForElementAndSendKeys(passInput,password);
        waitForElementAndClick(singIn);
        Thread.sleep(1000);
        Assert.assertTrue("Cannot login.",isElementVisible(submitCheck,10));

        LOGGER.info("Login success.");
    }

}
