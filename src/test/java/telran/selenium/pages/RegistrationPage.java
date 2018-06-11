package telran.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase {

    @FindBy(xpath = "//h4[contains(text(),'Данные компании')]")
    WebElement companyData;

    @FindBy(xpath = "//p[contains(text(),'Вход/Регистрация')]")
    WebElement canselRegistration;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoaded() {
        this.waitUntilIsLoadedCustomTime(companyData,40);
    }

    public boolean isRegistrationPage() {
        return exists(companyData);
    }

    public void waitUntilPageIsLoadedCansel() {
        this.waitUntilIsLoadedCustomTime(canselRegistration,40);
    }


    public boolean isLoginPageCansel() {
        return exists(canselRegistration);
    }
}
