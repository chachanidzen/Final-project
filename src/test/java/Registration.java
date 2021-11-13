import StepObject.RegistrationSteps;
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
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
@Listeners(Utils.TestListener.class)


public class Registration extends ChromeRunner {


    @Test(retryAnalyzer = Retry.class)
    @Description("go through registration process")

    public void newAccount() {
        SoftAssert soft = new SoftAssert();

        Selenide.open("/profiles-add.html");
        sleep(3000);
/*
        RegistrationSteps steps = new RegistrationSteps();


        steps
                .chooseAccountType();

        soft.assertTrue($(by("class", "radio valign")).is(Condition.checked));

        steps
                .emailAddress(email)
                .typePassword1(password1)
                .typePassword2(password2)
                .ltdName(ltdName)
                .ltdIdentity(ltdIdentity)
                .getTaxdocument();

        soft.assertFalse($("elm_48_33").is(Condition.checked));

        steps
                .representativeName(representativeName)
                .representativelastname(representativeLastname);

       // soft.assertTrue($(".ty-btn").is(Condition.enabled));*/
        soft.assertAll();



        element(by("class", "radio valign"), 1).click();

        $("#email").val("test@aaa.com");
        $("#password1").val("zxc-123");
        $("#password2").val("zxc-123");
        $("#elm_46").val("შპს ტესტი");
        $("#elm_47").val("12345678");

        $("#elm_48_34").click();
        //$("#elm_48").waitUntil(Condition.visible,2000).selectRadio("არა");
        sleep(3000);
        soft.assertTrue($("elm_48_33").is(Condition.checked));
        $("#elm_6").val("სახელი");
        $("#elm_7").val("გვარი");


        $(".ty-btn").shouldBe(Condition.enabled);
        sleep(2000);

    }
    @Test
    @Description("check error messages during regitration process")
    public void newAccount_second () {

        SoftAssert soft = new SoftAssert();
        open("/profiles-add.html");


    /*     RegistrationSteps steps=new RegistrationSteps();
         steps

          .chooseAccountType()
          .registrationButton()

          .emailErrorMessage()
          .emailAddress(email1)
          .emailErrorMessage()
          .emailAddress(email2)
          .emailErrorMessage();
          soft.assertTrue($("#password1_error_message").is(Condition.visible));
          soft.assertTrue($("#password2_error_message").is(Condition.visible));
          soft.assertEquals("#b94a48",Color.fromString($(".ty-error-tex").getCssValue("text")).asHex());
*/

        $(byText("ახალი ანგარიშის რეგისტრაცია")).click();
        $(byName("dispatch[profiles.update]")).click();
        $("#email_error_message").shouldBe(Condition.visible);
        $("#email").setValue("test");
        $("#email_error_message").shouldBe(Condition.visible);
        $("#email").setValue("test@sda");
        $("#email_error_message").shouldBe(Condition.visible);
        $("#email").setValue("testsda.com");
        $("#email_error_message").shouldBe(Condition.visible);
        soft.assertTrue($("#password1_error_message").is(Condition.visible));
        soft.assertTrue($("#password2_error_message").is(Condition.visible));
        //ერორ მესიჯის ტექსტის ფერ
        soft.assertEquals("#151515", Color.fromString($("#password1_error_message").getCssValue("color")).asHex());
        //ერორის შემთხვევაში ლეიბლების ტექსტის ფერი

        soft.assertEquals("#bf4d4d", Color.fromString($(".cm-failed-label").getCssValue("color")).asHex());

        soft.assertEquals("30px", $(byText("ახალი ანგარიშის რეგისტრაცია")).getCssValue("font-size"));

        soft.assertEquals("#000000", Color.fromString($(".cm-ajax").getCssValue("background-color")).asHex());


        soft.assertAll();


    }
}








