package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface BasketPageContants {


    ElementInfo basketButton = new ElementInfo("Could not add to cart", By.cssSelector(".gg-ui-btn-default.padding-none"));
    ElementInfo productAreaSelect = new ElementInfo("the product could not be selected", By.className("gg-input-select"));
    ElementInfo deleteProduct = new ElementInfo("The product could not be deleted", By.className("gg-icon-bin-medium"));
    ElementInfo basketControl = new ElementInfo("Cart could not be checked", By.xpath("//h2[.='Sepetinizde ürün bulunmamaktadır.']"));

}
