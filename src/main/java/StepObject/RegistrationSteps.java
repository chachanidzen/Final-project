package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import io.qameta.allure.Step;
public class RegistrationSteps extends RegistrationPage {

    @Step("click on button: ახალი ანგარიშის რეგისტრაცია")
    public RegistrationSteps signUp() {
        createAccount.click();
        return this;

    }
    @Step("click on select button to choose account type")
    public RegistrationSteps chooseAccountType() {
        accountType.click();

        return this;

    }

    @Step("fill email, Value: {0}")
    public RegistrationSteps emailAddress(String email) {
        emailAddress.setValue(email);
        return this;

    }
    @Step("fill new password field, Value: {0}")
    public RegistrationSteps typePassword1(String Password1) {
        emailAddress.setValue(Password1);
        return this;

    }
    @Step("fill confirm password field, Value: {0}")
    public RegistrationSteps typePassword2(String Password2) {
        emailAddress.setValue(Password2);
        return this;

    }

    @Step("fill company name, Value: {0}")
    public RegistrationSteps ltdName(String Ltdname) {
        ltdName.setValue(Ltdname);
        return this;

    }
    @Step("fill company identity number, Value: {0}")
    public RegistrationSteps ltdIdentity(String Ltdidentity) {
        ltdIdentity.setValue(Ltdidentity);
        return this;

    }

    @Step("click on select button for tax documents")
    public RegistrationSteps getTaxdocument() {
        getTaxdocument.click();

        return this;

    }
    @Step("fill company representative firstname, Value: {0}")
    public RegistrationSteps representativeName(String name) {
        representativeName.setValue(name);
        return this;

    }
    @Step("fill company representative lastname, Value: {0}")
    public RegistrationSteps representativelastname(String lastname) {
        representativeLastname.setValue(lastname);
        return this;

    }
    @Step("click on registration button for registration of new account")
    public RegistrationSteps registrationButton() {
        registrationButton.click();
        return this;

    }
    @Step("check if is visible email error message, if email field is in inccorect format or isn't fiels")
    public RegistrationSteps emailErrorMessage() {
        emailerror.shouldBe(Condition.visible);
        return this;

    }



}
