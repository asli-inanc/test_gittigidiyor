package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface LoginPageContants {
     ElementInfo login = new ElementInfo("Giriş yapılamadı", By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div"));
     ElementInfo loginbutton = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//div[@class='sc-12t95ss-3 fDarBX']/a[@href=\"https://www.gittigidiyor.com/uye-girisi\"]"));
     ElementInfo emailInput = new ElementInfo("E-posta adresi girilemedi", By.id("L-UserNameField"));
     ElementInfo passInput = new ElementInfo("E-posta şifresi girilemedi", By.id("L-PasswordField"));
     ElementInfo singIn = new ElementInfo("Giriş yapılamadı", By.id("gg-login-enter"));
     ElementInfo submitCheck= new ElementInfo("Hesabın elementi gözükmedi", By.xpath("//span[.='asliinanc178591']"));


}
