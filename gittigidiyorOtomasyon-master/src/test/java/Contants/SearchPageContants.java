package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface SearchPageContants {




     ElementInfo searchInput = new ElementInfo("E-posta adresi girilemedi", By.xpath("//div[@class=\"sc-4995aq-4 dNPmGY\"]/input"));
     ElementInfo secondPageButton = new ElementInfo("İkinci Sayfaya gidilemedi", By.xpath("//ul[@class='clearfix']/li/a[.='2']"));
     ElementInfo secondPageActiveControl = new ElementInfo("İkinci sayfa aktif değil", By.xpath("//li[@class='selected']/a[.='2']"));
     ElementInfo addBasketButton = new ElementInfo("Sepete eklenemedi", By.xpath("//button[@id='add-to-basket']"));

}
