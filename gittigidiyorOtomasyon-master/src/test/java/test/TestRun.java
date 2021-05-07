package test;

import Pages.BasketPage;
import Pages.LoginPage;
import Pages.SearchPage;
import base.BaseTest;
import org.junit.Test;

public class TestRun extends BaseTest {

    LoginPage loginPage;
    SearchPage searchPage;
    BasketPage basketPage;

    @Test
    public void  MyTest() throws InterruptedException{

        loginPage=new LoginPage();
        searchPage=new SearchPage();
        basketPage=new BasketPage();

        loginPage.singIn();
        searchPage.searchProduct();
        basketPage.goToBasketAndControlPrice();
        basketPage.deleteProductAndControl();



    }



}
