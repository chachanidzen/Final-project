package StepObject;

import PageObject.ChekoutPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class CheckoutSteps extends ChekoutPage {


    @Step("click brand checkbox")
    public CheckoutSteps chooseBrand() {

        selectBrand.click();

        return this;
    }
    @Step("click offer list filter ")
    public CheckoutSteps findOffer() {
        findOffer.click();

        return this;
    }
    @Step(" click offer checkbox")
    public CheckoutSteps chooseOffer() {
        chooseOffer.click();

        return this;
    }
    @Step("click on the product")
    public CheckoutSteps chooseProduct() {
        chooseProduct.click();

        return this;
    }


    @Step("click on add to cart btn.")
    public CheckoutSteps addToCart() {
        addToCart.click();

        return this;
    }

    @Step("click on go to cart btn.")
    public CheckoutSteps goToCheckout() {
        goToCheckout.click();

        return this;
    }
    @Step("check text: უსაფრთხო შეკვეთის გაფორმება")
    public CheckoutSteps checkCheckoutpage() {
        checkCheckoutpage.shouldBe(Condition.visible);

        return this;
    }
    @Step("fill email address, Value: {0}")
    public CheckoutSteps emailAdress (String email) {
        emailAddress.setValue(email);
        return this;
    }
    @Step("fill new password, Value: {0}")
    public CheckoutSteps newPassword(String password1) {
        newpassword.setValue(password1);
        return this;
    }
    @Step("fill confirm password, Value: {0}")
    public CheckoutSteps confirmPassword(String password2) {
        confirmpassword.setValue(password2);

        return this;
    }

    @Step("fill firstname, Value: {0}")
    public CheckoutSteps firstName(String firstname) {
        firstName.setValue(firstname);

        return this;
    }
    @Step("fill lastname, Value: {0}")
    public CheckoutSteps lastName(String lastname) {
        lastName.setValue(lastname);

        return this;
    }
    @Step("fill mobile number, Value: {0}")
    public CheckoutSteps getMobileNumber(String mobilnumber) {
        MobileNumber.setValue(mobilnumber);

        return this;
    }
    @Step("fill id number, Value: {0}")
    public CheckoutSteps getIdNumber(String idnumber) {
        IdNumber.setValue(idnumber);

        return this;
    }
    @Step("fill city, Value: {0}")
    public CheckoutSteps ChooseCity(String city) {
        City.setValue(city);

        return this;
    }
    @Step("fill address, Value: {0}")
    public CheckoutSteps chooseStreet(String street) {
        Street.setValue(street);

        return this;
    }
    @Step("click on payment select button")
    public CheckoutSteps choosePaymentMethod() {
        PaymentMethod.click();

        return this;
    }
    @Step("click on checkbox to accept terms and conditions")
    public CheckoutSteps acceptTermsandConditions() {
        acceptTermsandConditions.click();

        return this;
    }
    @Step("check if check bos is checked")
    public CheckoutSteps checkIfacceptedTerms() {
        checkIfacceptedTerms.shouldBe(Condition.checked);

        return this;
    }

    public CheckoutSteps choosePhone() {
        choosePhone.click();

        return this;
    }
    @Step ("click on button: შეკვეთის განთავსება")
    public CheckoutSteps orderButton() {
        makeOrder.click();

        return this;
    }
    @Step("check email error message")
    public CheckoutSteps emailAddressError() {
        emailError.shouldBe(Condition.visible);

        return this;
    }
    @Step("check new password error message")
    public CheckoutSteps newPasswordError() {
        newPasswordError.shouldBe(Condition.visible);

        return this;
    }
    @Step("check confirm password error message")
    public CheckoutSteps confirmPasswordError() {
        confirmPasswordError.shouldBe(Condition.visible);

        return this;
    }
    @Step("check firstname error message")
    public CheckoutSteps firstNameError() {
        firstNameError.shouldBe(Condition.visible);

        return this;
    }
    @Step("check surname error message")
    public CheckoutSteps lastNameError() {
        lastNameError.shouldBe(Condition.visible);

        return this;
    }
    @Step("check mobile number error message")
    public CheckoutSteps mobileNumberError() {
        mobileNumberError.shouldBe(Condition.visible);

        return this;
    }
    @Step("check id number error message")
    public CheckoutSteps idNumberError() {
        idNumberError.shouldBe(Condition.visible);
        return this;
    }

    @Step("check city error message")
    public CheckoutSteps cityError() {
        cityError.shouldBe(Condition.visible);

        return this;
    }
    @Step("check address error message")
    public CheckoutSteps addressError() {
        addressError.shouldBe(Condition.visible);

        return this;
    }
    @Step("check that accept terms and condiotion button is not checked")
    public CheckoutSteps checkIfselectedacceptedTerms() {
        checkIfacceptedTerms.shouldNotBe(Condition.selected);

        return this;
    }
    @Step("check accept terms and condition error message")
    public CheckoutSteps acceptTermsError() {
        acceptTermsError.shouldBe(Condition.visible);

        return this;
    }

}

