package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface LoginPageContants {
     ElementInfo login = new ElementInfo("Could not login", By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div"));
     ElementInfo loginbutton = new ElementInfo("Login button not found", By.xpath("//div[@class='sc-12t95ss-3 fDarBX']/a[@href=\"https://www.gittigidiyor.com/uye-girisi\"]"));
     ElementInfo emailInput = new ElementInfo("E-mail address could not be entered", By.id("L-UserNameField"));
     ElementInfo passInput = new ElementInfo("E-mail password could not be entered", By.id("L-PasswordField"));
     ElementInfo singIn = new ElementInfo("Could not login", By.id("gg-login-enter"));
     ElementInfo submitCheck= new ElementInfo("Account element not visible", By.xpath("//span[.='asliinanc178591']"));


}
