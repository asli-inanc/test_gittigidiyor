package Pages;

import Contants.BasketPageContants;
import Contants.SearchPageContants;
import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasketPage extends BasePage implements BasketPageContants

{
    private Logger LOGGER = LogManager.getLogger(BasketPage.class);
    SearchPage searchPage;
    public void goToBasketAndControlPrice() {

        searchPage=new SearchPage();

        javaScriptClicker(basketButton);
        WebElement secondByPrice = driver.findElement(By.xpath("//div[@class='new-price-box']//p"));
        String secondPriceText = secondByPrice.getText();
        LOGGER.info("Take second price succsess.");
        System.out.println("Second price :" + secondPriceText);
        System.out.println("Basket first price text :" + SearchPage.firstPriceText);
        Assert.assertEquals("First price and second price not equals", SearchPage.firstPriceText, secondPriceText);

        LOGGER.info("First price and second price equals");
    }

 public void deleteProductAndControl()
 {
    waitSeconds(1);
    waitForElementAndClick(productAreaSelect);
    waitSeconds(1);
    WebElement webElement= driver.findElement(By.xpath("//*[@class='amount']"));
    countProducts(webElement);
        LOGGER.info("Add count product.");
    waitForElementAndClick(deleteProduct);
        LOGGER.info("Delete product to basket.");
    waitSeconds(3);
        Assert.assertTrue("Basket is not empty.", isElementVisible(basketControl, 5));
        LOGGER.info("Basket is empty.");

}
    public void countProducts(WebElement webElement) {

        Select two = new Select(webElement);
        two.selectByIndex(1);
        webElement.click();

    }

}
