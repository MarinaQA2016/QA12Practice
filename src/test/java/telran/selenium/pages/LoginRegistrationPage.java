package telran.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginRegistrationPage extends PageBase {
    @FindBy(xpath = "//input[@id='username']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordField;

    @FindBy(xpath = "//h4[contains(text(),'Регистрация')]")
    WebElement registration;

    @FindBy(xpath = "//input[@id='username']")
    WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonSubmit;

    @FindBy(xpath = "//a[@class='flipper'][contains(text(),'Регистрация')]")
    WebElement buttonRegistration;

    @FindBy(xpath = "//input[@id='seller']")
    WebElement buttonSeller;
    @FindBy(xpath = "//input[@id='buyer']")
    WebElement buttonBuyer;

    @FindBy(xpath = "//input[@id='mailRegistration']")
    WebElement mailRegistration;

    @FindBy(xpath = "//input[@id='phoneRegistration']")
    WebElement phoneRegistration;

    @FindBy(xpath = "//input[@id='loginRegistration']")
    WebElement nameUser;

    @FindBy(xpath = "//input[@placeholder='Введите название компании']")
    WebElement nameCompany;

    @FindBy(xpath = "//input[@id='passwordRegistration1']")
    WebElement passwordRegistration1;

    @FindBy(xpath = "//input[@id='passwordRegistration2']")
    WebElement passwordRegistration2;

    @FindBy(xpath = "//input[@id='offerRegistration']")
    WebElement offerRegistration;

    @FindBy(xpath = "//button[@class='personalPageBtnRed'][contains(text(),'Создать пользователя')]")
    WebElement buttonCreatUser;

    @FindBy(xpath = "//button[@class='personalPageBtnRed'][contains(text(),'Отмена')]")
    WebElement buttonCansel;

    @FindBy(xpath = "//button[@type='button']")
    WebElement buttonCanselRegistration;



    public LoginRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoaded() {
        this.waitUntilIsLoadedCustomTime(emailField,40);
        this.waitUntilIsLoadedCustomTime(passwordField,40);
        this.waitUntilIsLoadedCustomTime(buttonSubmit,40);

    }

    public boolean isLoginRegistrationPage() {
        return exists(emailField);
    }

    public void putTextToFieldEmail(String text) {
        typeTextField(email,text);
    }
    public void putTextToFieldPassword(String text) {
        typeTextField(password,text);
    }

    public void clickButtonSubmit() {
        buttonSubmit.click();
    }

    public void clickButtonRegistration() {
        buttonRegistration.click();
    }

    public void waitUntilPageLoadedRegistration() {
        this.waitUntilIsLoadedCustomTime(registration,40);
    }

    public void clickButtonSeller() {
        buttonSeller.click();
    }

    public void putTextToFielMailRegistration(String text) {
        typeTextField(mailRegistration,text);
    }

    public void putTextToFieldPhoneRegistration(String text) {
        typeTextField(phoneRegistration,text);
    }

    public void putTextToFieldLoginRegistration(String text) {
        typeTextField(nameUser,text);
    }

    public void putTextToFieldnewCompanyName(String text) {
        typeTextField(nameCompany,text);
    }

    public void putTextToFieldPasswordRegistration1(String text) {
        typeTextField(passwordRegistration1,text);
    }

    public void putTextToFieldPasswordRegistration2(String text) {
        typeTextField(passwordRegistration2,text);
    }

    public void clickButtonOfferRegistration() {
        offerRegistration.click();
    }

    public void clickButtonCreateUser() {
        buttonCreatUser.click();
    }

    public boolean isRegistrationPage() {
        return exists(buttonCreatUser);
    }

    public void clickButtonCancel() {
        buttonCansel.click();
    }

    public void clickButtonBuyer() {
      buttonBuyer.click();
    }

    public void clickButtonCansel() {
        buttonCanselRegistration.click();
    }
}
