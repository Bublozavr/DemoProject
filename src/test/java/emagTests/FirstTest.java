package emagTests;

import common.CommonTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest extends CommonTest {

    @Test
    public void testPampersPrice(){
        //open Emag web site
        open("https://www.emag.bg/homepage");

        //Check Emag web site is opened
        mainPage.checkPageIsOpened();

        //Search 'Pampers Premium Care 3'
        mainPage.searchFor("Pampers Premium Care 3");

        //Check title
        mainPage.checkTitle();

        //Add Product to Frogger
        mainPage.addProductToFrogger("Пелени Pampers Premium Care XXL Размер 3, 6-10 кг, 200 бр");

        //Check pop-up
        mainPage.checkPopUp();
    }
}
