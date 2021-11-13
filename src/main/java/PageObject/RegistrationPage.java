package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;

public class RegistrationPage {


    protected SelenideElement


            createAccount= $(byText("ახალი ანგარიშის რეგისტრაცია")).waitUntil(Condition.visible,3000),
            accountType=$(by("class", "radio valign")).waitUntil(Condition.visible,3000),
            emailAddress=$("#email").waitUntil(Condition.visible,2000),
            password1=$("#password1"),
            password2=$("#password2"),
            ltdName=$("#elm_46"),
            ltdIdentity=$("#elm_47"),
            getTaxdocument= element(by("class", "radio valign"), 1),
            representativeName=$("#elm_6"),
            representativeLastname=  $("#elm_7"),
            registrationButton= $(".ty-btn").waitUntil(Condition.visible,2000),
            emailerror=$("#email_error_message");







}

