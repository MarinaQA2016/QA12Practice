package telran.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(xpath = "//p[contains(text(),'Личный кабинет')]")
    WebElement confirmationOfEntry;

    @FindBy(xpath = "//p[contains(text(),'Вход/Регистрация')]")
    WebElement cansel;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoaded() {
        this.waitUntilIsLoadedCustomTime(confirmationOfEntry,40);

    }

    public boolean isLoginPage() {
        return exists(confirmationOfEntry);
    }

    public void waitUntilPageIsLoadedCansel() {
        this.waitUntilIsLoadedCustomTime(cansel,40);
    }

    public boolean isLoginPageCansel() {
        return exists(cansel);
    }
}
