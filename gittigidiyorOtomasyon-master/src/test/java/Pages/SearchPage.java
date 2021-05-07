package Pages;

import Contants.SearchPageContants;
import base.BasePage;
import base.BaseTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class SearchPage extends BasePage implements SearchPageContants {
    String searchText = "bilgisayar";
   public static String firstPriceText;

    private Logger LOGGER = LogManager.getLogger(SearchPage.class);
    protected WebDriver driver = BaseTest.driver;
    private WebDriverWait wait = new WebDriverWait(driver, 15, 1000);


    public void searchProduct() {
        waitForElementAndSendKeys(searchInput, searchText);
        LOGGER.info("Written text to search area.");
        driver.findElement(By.xpath("//input[@placeholder='Keşfetmeye Bak']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//ul[@class='clearfix']/li/a[.='2']")).sendKeys(Keys.DOWN);
        waitForElementAndClick(secondPageButton);
        Assert.assertTrue("Cannot go to second page.", isElementVisible(secondPageActiveControl, 10));
        LOGGER.info("Second page succsess");
        chooseRandomProduct();   //select random product and take a price
        javaScriptClicker(addBasketButton);

    }




    public void chooseRandomProduct() {


        Random random = new Random();
        List<WebElement> imgSrcList = driver.findElements(By.xpath("//ul[@class='catalog-view clearfix products-container']//p/img"));
        int randomImg = random.nextInt(imgSrcList.size());
        By by = By.xpath("(//a[@class='product-link']//p/img)[" + randomImg + "]");

        System.out.println("Random boutique by : " + by);
        System.out.println("Random image number : " + randomImg);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        waitSeconds(3);
        driver.findElement(by).click();
        LOGGER.info("Select random product succsess.");
        WebElement byPrice = driver.findElement(By.xpath("//div[@id='sp-price-container']//div[2]"));
        firstPriceText = byPrice.getText();
        LOGGER.info("Take first price succsess.");
        System.out.println("First price :" + firstPriceText);

    }

}
