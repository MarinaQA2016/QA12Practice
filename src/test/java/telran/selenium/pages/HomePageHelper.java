package telran.selenium.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import telran.selenium.LogLog4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sample page
 */
public class HomePageHelper extends PageBase {

//for logging
  private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

//elements definition

  @FindBy(xpath = "//p[@class = 'nav']/a[contains(text(),'Я ПРОДАВЕЦ')]")
  WebElement imSellerMenu;

  @FindBy(xpath = "//p[@class = 'nav']/a[contains(text(),'Я ПОКУПАТЕЛЬ')]")
  WebElement imBuyerMenu;

  @FindBy(xpath = "//p[@class = 'nav']/a[contains(text(),'ТОРГОВАЯ ПЛОЩАДКА')]")
  WebElement marketPlaceMenu;

  @FindBy (xpath = "//button[@class = 'flag']/img[@alt = 'russian']")
  WebElement languageRus;

  @FindBy (xpath = "//button[@class = 'flag']/img[@alt = 'english']")
  WebElement languageEngl;

  @FindBy (xpath = "//button[@class = 'flag']/img[@alt = 'hebrew']")
  WebElement languageHebrew;

  @FindBy(className  = "flag")
  List<WebElement> languagesButtons;

  @FindBy(className = "nav")
  List<WebElement> menuCommands;

  @FindBy(css = "span.ng-binding")
  WebElement centralText;



  public HomePageHelper(WebDriver webDriver) {

    super(webDriver);
    PageFactory.initElements(driver, this);
  }

  //methods

  public HomePageHelper clickLangRussian(){
    this.languageRus.click();
    return this;
  }

  public HomePageHelper clickLangEnglish(){
    this.languageEngl.click();
    return this;
  }

  public HomePageHelper clickLangHebrew(){
    this.languageHebrew.click();
    return this;
  }
  public HomePageHelper clickImSellerMenu(){
    this.imSellerMenu.click();
    return this;
  }
  public HomePageHelper clickImBuyerMenu(){
    this.imBuyerMenu.click();
    return this;
  }
  public HomePageHelper clickMarketPlace(){
    this.marketPlaceMenu.click();
    return this;
  }

  public boolean allElementsInRus() {

    //another elements from HomePage verification, russian language
    if (!allMenuCommandsInLang("Rus")) return false;
    return true;
  }

  public boolean allElementsInEng() {
    //another elements from HomePage verification, english language
    if (!allMenuCommandsInLang("Eng")) return false;
    return true;
  }

  public boolean allElementsInHebrew(){
    //another elements from HomePage verification, hebrew language
    if (!allMenuCommandsInLang("Heb")) return false;
    return true;
  }


  private boolean allMenuCommandsInLang(String lang) {
    String names[];
    switch (lang){
      case "Rus": names = new String[]{"Я ПОСТАВЩИК", "Я ПОКУПАТЕЛЬ", "ТОРГОВАЯ ПЛОЩАДКА"};break;
      case "Eng": names = new String[] {"I AM SELLER", "I AM BUYER", "MARKET PLACE"};break;
      case "Heb": names = new String[] {"אני מוכר","אני קונה","רְחָבַת שׁוּק"};break;
      default:  return false;
    }
    List<String> namesList = new ArrayList<String>(Arrays.asList(names));
    for(WebElement el : menuCommands){
      if (!namesList.contains(el.getText())) return false;
    }
    return true;
  }



  // ----- just for code testing ----------
  public HomePageHelper writeTextOfButtons(){
    System.out.println ("Quantity of elements: " + languagesButtons.size());
    for(WebElement el : languagesButtons){
      System.out.println("Tag Name: " + el.getTagName());
      System.out.println("attr: ng-click - " + el.getAttribute("ng-click"));
    }
    return this;
  }

  // ----- just for code testing ----------
  public HomePageHelper writeTextOfMenuCommands(){
    System.out.println ("Quantity of elements: " + menuCommands.size());
    for(WebElement el : menuCommands){
      System.out.println("Name of menu: " + el.getText());
    }
    return this;
  }

}
