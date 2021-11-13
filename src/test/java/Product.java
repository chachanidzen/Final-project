import Utils.ChromeRunner;
import Utils.Retry;
import io.qameta.allure.Description;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
@Listeners(Utils.TestListener.class)

public class Product extends ChromeRunner {


    @Test(retryAnalyzer = Retry.class)
    @Description("add products to compare list")
    public void newProduct() {
        SoftAssert soft = new SoftAssert();
        open("/phones-and-communications/smartphones.html");


  /*   ProductSteps steps=new ProductSteps();
       steps

                .Brand()
                .OperatingSyStemList()
                .chooseOperatingSystem()
                .chooseFirstProduct()
                .checkImage()
                .checkNextImage()
                .checkPreviouseImage()
                .closeImage();
        soft.assertEquals("52px", $(".ty-price-num").getCssValue("font-size"));
        steps
                .checkIfAdded()
                .checkAvailableMarkets()
                .goBackToProduct();
        soft.assertEquals("#151515", Color.fromString($(".ty-add-to-wish").getCssValue("color")).asHex());
        steps
                .addToCompareList()
                .checkIfAdded();

        open("/smartphones.html?features_hash=");
        steps
                .chooseBrand()
                .FilterList()
                .chooseFilter()
                .addToCompareList()
                .goToCompareList()
                .compareProducts()
                .countCompareProducts();

*/



        $("#elm_checkbox_27_329_127").waitUntil(visible, 2000).click();
        $(byText("Operating System")).waitUntil(visible, 2000).click();
        $("#elm_checkbox_27_89_680").waitUntil(visible,2000);
        $("#det_img_34948").click();
        $(".ty-pict").waitUntil(visible, 2000).click();
        $(".pp_next").waitUntil(visible, 2000).click();
        $(".pp_previous").waitUntil(visible, 2000).click();
        $(".pp_close").waitUntil(visible, 3000).click();
        soft.assertEquals("52px", $(".ty-price-num").getCssValue("font-size"));
        $("#show_stock").click();
        $(".stores_info_big_block_class").shouldBe(visible);
        $("#hide_stock_2").click();

        soft.assertEquals("#151515", Color.fromString($(".ty-add-to-wish").getCssValue("color")).asHex());


        $(byLinkText("შედარებაში")).click();
        $(byText("პროდუქტი დამატებულია შედარების სიაში")).shouldBe(visible);

        open("/smartphones.html?features_hash=");
        $("#elm_checkbox_27_329_128").waitUntil(visible, 2000).click();
        $("#sw_elm_sort_fields").click();
        $(byText("დალაგება ფასით: კლებადობით")).click();
        $("#det_img_38328").click();
        $(byLinkText("შედარებაში")).click();
        element(by("title", "შედარების სია")).click();
        $(byText("პროდუქტების შედარება")).click();
        $(".ty-compare-counter").shouldBe(visible);
        $(by("type", "checkbox")).shouldBe(checked);
        element(by("title", "შედარების სია")).click();
        $(".clear-cl").click();
        element(by("title", "შედარების სია")).click();
        $(byText("ამ კატეგორიაში არ არის პროდუქტები")).shouldBe(visible);

        soft.assertAll();



    }


    @Test(retryAnalyzer = Retry.class)
    @Description("choose filters")


    public void Filters() {
        open("/smartphones.html?features_hash=");
        SoftAssert soft = new SoftAssert();
/*

         ProductSteps steps=new ProductSteps();
         steps

                 .chooseBrand()
                 .chooseFilter()
                 .getNewestProduct()
                 .goToOfferList()
                 .getOffer()
                 .OperatingSyStemList()
                 .getOperatingSystemtype()
                 .defineMaxPrice()
                 .defineMinPrice();
        soft.assertFalse($(byText("ამ კატეგორიაში არ არის პროდუქტები")).is(visible));


*/


        $("#elm_checkbox_27_329_128").waitUntil(visible, 2000).click();
        $("#sw_elm_sort_fields").waitUntil(visible,2000).click();
        $(byText("ახალი პროდუქტებით")).click();

        $("#sw_content_27_285").waitUntil(visible,2000).click();
        $("#elm_checkbox_27_285_58703").waitUntil(visible,2000).click();
        $("#sw_content_27_89").waitUntil(visible,2000).click();
        $("#elm_checkbox_27_89_931").waitUntil(visible,2000).click();

        $("#slider_27_17_right").setValue("7000").waitUntil(visible,2000);
        $("#slider_27_17_left").setValue("6000");

        sleep(2000);

        soft.assertTrue($(byText("ამ კატეგორიაში არ არის პროდუქტები")).is(visible));




        soft.assertAll();











    }
}
