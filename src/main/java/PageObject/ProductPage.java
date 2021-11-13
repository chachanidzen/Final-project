package PageObject;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

   public class ProductPage {

    protected SelenideElement


            Brand= $("#elm_checkbox_27_329_127").waitUntil(visible, 2000),
            OperationgSyStemList=$(byText("Operating System")).waitUntil(visible, 2000),
            chooseOperatingSystem= $("#elm_checkbox_27_89_680"),
            chooseFirstProduct=$("#det_img_34948"),
            checkImage=$(".ty-pict").waitUntil(visible, 2000),
            checkNextImage=$(".pp_next").waitUntil(visible, 2000),
            checkPreviouseImage=$(".pp_previous").waitUntil(visible, 2000),
            closeImage=$(".pp_close").waitUntil(visible, 3000),
            checkMarketslist=$("#show_stock"),
            checkAvailableMarkets=$(".stores_info_big_block_class"),
            goBackToProduct=$("#hide_stock_2"),

    addToCompareList=$(byLinkText("შედარებაში")),
            checkIfAdded=$(byText("პროდუქტი დამატებულია შედარების სიაში")),
    //ტელეფონებში დაბრუნება
    chooseBrand=$("#elm_checkbox_27_329_128").waitUntil(visible, 2000),
            FilterList=$("#sw_elm_sort_fields"),
            chooseFilter= $(byText("დალაგება ფასით: კლებადობით")),
            chooseSecondProduct=$("#det_img_38328"),
    //შედარების სიაში დამატება
    compareList= element(by("title", "შედარების სია")),
            compareProducts=$(byText("პროდუქტების შედარება")),
            countComparedProduct=$(".ty-compare-counter"),
            chooseNewProduct=$(byText("ახალი პროდუქტებით")),
            offerlist= $("#sw_content_27_285").waitUntil(visible,2000),
            chooseoffer=$("#elm_checkbox_27_285_58703").waitUntil(visible,2000),
            operatingSyStemList=$("#sw_content_27_89").waitUntil(visible,2000),
            OperatingSystemtype=$("#elm_checkbox_27_89_931").waitUntil(visible,2000),
            minimumPrice=$("#slider_27_17_left"),

    maximumPrice=$("#slider_27_17_right");






}



