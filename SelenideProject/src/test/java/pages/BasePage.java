package pages;

import com.codeborne.selenide.Selenide;
import utilis.PropertyManager;

public class BasePage {

    protected String pageUrl;
    PropertyManager  propertyManager=new PropertyManager();
    public BasePage(String pageUrl){
        this.pageUrl=pageUrl;
    }

    public void openElements(){
       String url=propertyManager.getProperty("APP_URL");
       Selenide.open(url+"elements");
    }

    public void openWebTables(){
        String url=propertyManager.getProperty("APP_URL");
        Selenide.open(url+"webtables");
    }


    /*
    public String getUrl(){
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
     */
}
