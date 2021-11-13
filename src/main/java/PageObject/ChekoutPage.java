package PageObject;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ChekoutPage {




    protected SelenideElement


            selectBrand=  $("#elm_checkbox_27_329_128").waitUntil(visible,3000),
            findOffer=$("#sw_content_27_285").waitUntil(visible,2000),
            chooseOffer=$("#elm_checkbox_27_285_58703").waitUntil(visible,2000),
            chooseProduct= $("#det_img_36416").waitUntil(visible,2000),
         /*  addTocart=$("#button_cart_34306"),
            goTocart=$(".ty-dropdown-box__title").waitUntil(visible,2000),
            makeOrder=$(byText("შეკვეთის გაფორმება")),
         *//*   imageOfProduct= $(".ty-pict").waitUntil(visible, 2000),
            NextImage=$(".pp_next"),
            PreviousImage=$(".pp_previous"),
            closeImages= $(".pp_close"),*/

    addToCart=$("#button_cart_35809"),



    goToCheckout=$(byText("შეკვეთის გაფორმება")),
            checkCheckoutpage= $(withText("უსაფრთხო შეკვეთის გაფორმება")),
            emailAddress=$("#email"),
            newpassword=$("#password1"),
            confirmpassword=$("#password2"),
            firstName=$("#elm_6"),
            lastName= $("#elm_7"),
            MobileNumber=$("#elm_9"),
            IdNumber=$("#elm_36"),
            City=$("#elm_23"),
            Street=$("#elm_19"),
            PaymentMethod=$("#payment_25"),
            acceptTermsandConditions=$("#id_accept_terms"),
            checkIfacceptedTerms= $("#id_accept_terms"),
            choosePhone=$("#det_img_36416").waitUntil(visible,2000),
            Order=$(byText("შეკვეთის გაფორმება")).waitUntil(visible,2000),
            emailError=$("#email_error_message"),
            newPasswordError=$("#password1_error_message"),
            confirmPasswordError=$("#password2_error_message"),
            firstNameError=$("#elm_6_error_message"),
            lastNameError=$("#elm_7_error_message"),
            mobileNumberError=$("#elm_9_error_message"),
            idNumberError=$("#elm_36_error_message"),
            cityError=$("#elm_23_error_message"),
            addressError=$("#elm_19_error_message"),
            acceptTermsError=$("#id_accept_terms_error_message"),
            makeOrder=$(byName("dispatch[checkout.place_order]"));
















}
