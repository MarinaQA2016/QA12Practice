package telran.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Inka on 21-Apr-18.
 */
public class MarketPlacePageHelper_Marina extends PageBase {
    public MarketPlacePageHelper_Marina(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
