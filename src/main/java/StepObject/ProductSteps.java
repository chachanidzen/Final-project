package StepObject;

import PageObject.ProductPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class ProductSteps extends ProductPage {


    @Step("click on checkbox to choose smartphone brand")
    public ProductSteps Brand(){

        Brand.click();
        return this;

    }

    @Step("cklick on operating system filter")
    public ProductSteps OperatingSyStemList(){

        OperationgSyStemList.click();
        return this;

    }
    @Step("cklick on checkbox to choose a type of operating system ")
    public ProductSteps chooseOperatingSystem(){

        chooseOperatingSystem.click();
        return this;

    }
    @Step("click on product for checking details")
    public ProductSteps chooseFirstProduct(){

        chooseFirstProduct.click();
        return this;

    }

    @Step("click on image of product")
    public ProductSteps checkImage(){

        checkImage.click();
        return this;

    }

    @Step("click on next image button")
    public ProductSteps checkNextImage(){

        checkNextImage.click();
        return this;

    }

    @Step("click on previous image button")
    public ProductSteps checkPreviouseImage(){

        checkPreviouseImage.click();
        return this;

    }

    @Step("click on close button to close the image")
    public ProductSteps closeImage(){

        closeImage.click();
        return this;

    }
    @Step("click on next image button")
    public ProductSteps checkMarketslist(){

        checkMarketslist.click();
        return this;

    }
    @Step("click on button: ნაშთი მაღაზიებში")
    public ProductSteps checkAvailableMarkets(){

        checkAvailableMarkets.shouldBe(Condition.visible);
        return this;

    }
    @Step("click on button: უკან დაბრუნება")
    public ProductSteps goBackToProduct(){

        goBackToProduct.click();
        return this;

    }
    @Step("click on add to compare list button")
    public ProductSteps addToCompareList(){

        addToCompareList.click();

        return this;

    }
    @Step("click on compare list button")
    public ProductSteps goToCompareList(){

        compareList.click();
        return this;

    }

    @Step("click on compare list button")
    public ProductSteps checkIfAdded(){

        checkIfAdded.shouldBe(Condition.visible);
        return this;

    }

    @Step("click on checkbox to choose smartphone brand")
    public ProductSteps chooseBrand(){

        chooseBrand.click();
        return this;

    }
    @Step("click on filter list")
    public ProductSteps FilterList(){

        FilterList.click();
        return this;

    }
    @Step("choose filter type from filter list")
    public ProductSteps chooseFilter(){

        chooseFilter.click();
        return this;

    }
    @Step("click on product")
    public ProductSteps chooseSecondProduct(){

        chooseSecondProduct.click();
        return this;

    }


    @Step("open compare list")
    public ProductSteps compareProducts(){

        compareProducts.click();
        return this;

    }

    @Step("check amount of products in the list")
    public ProductSteps countCompareProducts(){

        countComparedProduct.shouldBe(Condition.visible);
        return this;

    }
    @Step("choose new filter: ახალი პროდუქტი")
    public ProductSteps getNewestProduct(){

        chooseNewProduct.click();
        return this;

    }

    @Step("click on offer list")
    public ProductSteps goToOfferList(){

        offerlist.click();
        return this;

    }

    @Step("choose offer from lisr")
    public ProductSteps getOffer(){

        chooseoffer.click();
        return this;

    }

    @Step("choose type of operationg systme list")
    public ProductSteps getOperatingSystemtype(){

        chooseOperatingSystem.click();
        return this;

    }
    @Step("fill minimum price")
    public ProductSteps defineMinPrice(){

        minimumPrice.click();
        return this;

    }
    @Step("fill maximum price")
    public ProductSteps defineMaxPrice(){

        maximumPrice.click();
        return this;

    }
}
