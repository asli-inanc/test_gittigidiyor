package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface SearchPageContants {




     ElementInfo searchInput = new ElementInfo("E-mail address could not be entered", By.xpath("//div[@class=\"sc-4995aq-4 dNPmGY\"]/input"));
     ElementInfo secondPageButton = new ElementInfo("Could not go to second page", By.xpath("//ul[@class='clearfix']/li/a[.='2']"));
     ElementInfo secondPageActiveControl = new ElementInfo("The second page is not active", By.xpath("//li[@class='selected']/a[.='2']"));
     ElementInfo addBasketButton = new ElementInfo("Could not add to cart", By.xpath("//button[@id='add-to-basket']"));

}
