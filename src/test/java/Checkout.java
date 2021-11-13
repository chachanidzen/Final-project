import Utils.ChromeRunner;
import Utils.Retry;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static DataObject.RegistrationData.*;
import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
@Listeners(Utils.TestListener.class)



public class Checkout extends ChromeRunner  {
    @Test(retryAnalyzer = Retry.class)
    @Description("go through the process of making order")
    public void buyProduct() {

        SoftAssert soft = new SoftAssert();

        open("/phones-and-communications/smartphones.html");
       /* sleep(3000);
        CheckoutSteps steps = new CheckoutSteps();
        steps
                .chooseBrand()
                .findOffer()
                .chooseOffer()
                .chooseProduct()
                .addToCart()
                .goToCheckout()
                .checkCheckoutpage()
                .emailAdress(email)
                .newPassword(password1)
                .confirmPassword(password2)
                .firstName(firstname)
                .lastName(lastname)
                .getMobileNumber(mobilenumber)
                .getIdNumber(idnumber)
                .ChooseCity(city)
                .chooseStreet(street)
                .choosePaymentMethod();
        soft.assertTrue($("#payment_25").isSelected());
        steps
                .acceptTermsandConditions()
                .checkIfacceptedTerms();


        soft.assertAll();
*/


        sleep(2000);
        // $("#quick_search").setValue("Samsung");



        $("#elm_checkbox_27_329_128").waitUntil(visible, 3000).click();

        $("#sw_content_27_285").click();

        //$$(".ty-product-filters__block").filter(visible).shouldHave(CollectionCondition.size(21));
        $("#icons_35809").waitUntil(visible, 2000).click();
        soft.assertEquals("16px", $(byText("Samsung G991B Galaxy S21 (8GB/128GB) Dual Sim LTE/5G - Phantom Gray")).getCssValue("font-size"));


        //
        $("#button_cart_35809").click();

        $(byText("კალათაში")).waitUntil(visible,2000).click();
        soft.assertFalse($(byText("თქვენი კალათა ცარიელია")).is(visible));
        $(byText("შეკვეთის გაფორმება")).click();
        $(withText("უსაფრთხო შეკვეთის გაფორმება")).shouldBe(visible);
        $("#email").setValue("test@asd.com");
        $("#password1").setValue("123456");
        $("#password2").setValue("123456");
        $("#elm_6").setValue("სახელი");
        $("#elm_7").setValue("გვარი");
        $("#elm_9").setValue("55555555");
        $("#elm_36").setValue("00000000000");
        // $(byText("სახლში მიტანა")).shouldBe(visible);
        $("#elm_23").setValue("თბილისი");
        $("#elm_19").setValue("რუსთაველის ქუჩა N 10");
        $("#payment_25").click();
        soft.assertTrue($("#payment_25").isSelected());
        $("#id_accept_terms").click();
        $("#id_accept_terms").shouldBe(checked);

        soft.assertAll();
        sleep(2000);
    }





    @Test(retryAnalyzer = Retry.class)
    @Description("check error messages during chekout process")
    public void Test(){

        open("/phones-and-communications/smartphones.html");
       /* CheckoutSteps steps=new CheckoutSteps();
        steps

                .chooseProduct()
                .addToCart()
                .goToCheckout()
                .orderButton()
                .emailAddressError()
                .newPasswordError()
                .confirmPasswordError()
                .firstNameError()
                .lastNameError()
                .mobileNumberError()
                .idNumberError()
                .cityError()
                .addressError()
                .checkIfselectedacceptedTerms()
                .acceptTermsError();*/


        $("#det_img_36416").waitUntil(visible,2000).click();
        $("#button_cart_36416").click();
        $(byText("შეკვეთის გაფორმება")).waitUntil(visible,2000).click();
        $(byName("dispatch[checkout.place_order]")).waitUntil(visible,2000).click();
        $("#email_error_message").shouldBe(visible);
        $("#password1_error_message").shouldBe(visible);
        $("#password2_error_message").shouldBe(visible);
        $("#elm_6_error_message").shouldBe(visible);
        $("#elm_7_error_message").shouldBe(visible);
        $("#elm_9_error_message").shouldBe(visible);

        $("#elm_36_error_message").shouldBe(visible);
        $("#elm_23_error_message").shouldBe(visible);
        $("#elm_19_error_message").shouldBe(visible);
        $("#id_accept_terms_error_message").shouldBe(visible);






    }
}




