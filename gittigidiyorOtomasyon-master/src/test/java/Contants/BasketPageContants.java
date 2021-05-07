package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface BasketPageContants {


    ElementInfo basketButton = new ElementInfo("Sepette eklenemedi", By.cssSelector(".gg-ui-btn-default.padding-none"));
    ElementInfo productAreaSelect = new ElementInfo("Urun seçilemedi", By.className("gg-input-select"));
    ElementInfo deleteProduct = new ElementInfo("Urun Silinemedi", By.className("gg-icon-bin-medium"));
    ElementInfo basketControl = new ElementInfo("Sepet kontrol edilemedi", By.xpath("//h2[.='Sepetinizde ürün bulunmamaktadır.']"));

}
