package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import driver.DriverFactory;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;

public class WebTables extends BasePage {

    public SelenideElement addbtn=$("#addNewRecordButton");
    public SelenideElement firstName=$("input#firstName");
    public SelenideElement lastName=$("input#lastName");
    public SelenideElement email=
            $("div [class=\"col-md-9 col-sm-12\"]>[placeholder=\"name@example.com\"]");
    public SelenideElement age=$("input[id=\"age\"][placeholder=\"Age\"]");
    public SelenideElement salary=$("div[class=\"col-md-9 col-sm-12\"]>[id=\"salary\"]");
    public SelenideElement department=$("#department");
    public SelenideElement submit=$("#submit");
    public SelenideElement editBtn=$("div[class=\"action-buttons\"]>span[id=\"edit-record-4\"]");
    public SelenideElement editFirstname=
            $("form[id=\"userForm\"]>div input[id=\"firstName\"][placeholder=\"First Name\"]");
    public SelenideElement editSubmitBtn=
            $("form[id=\"userForm\"]>div button[id=\"submit\"][type=\"submit\"]");
    public SelenideElement editedRow =
            $("div[class=\"rt-tr-group\"]:nth-child(4) div[class=\"rt-td\"]:nth-child(1)");

    public WebTables(String pageUrl) {
        super(pageUrl);
    }

    public void clickToButtons(){
        new Actions(DriverFactory.currentDriver()).scrollByAmount(0, 300).perform();
        addbtn.click();
    }
    public void fillTheForm(){
        firstName.type("ayse");
        lastName.type("yilmaz");
        email.type("xxx@mail.com");
        age.type("25");
        salary.type("30000");
        department.type("IT");
        submit.click();
    }

    public void editForm(){
        editBtn.click();
    }

    public void editName(){
        editFirstname.clear();
        editFirstname.type("Merve");
        editSubmitBtn.click();
    }

}
