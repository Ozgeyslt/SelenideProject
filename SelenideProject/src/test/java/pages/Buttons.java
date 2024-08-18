package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class Buttons extends BasePage {

    public SelenideElement buttons=$("#item-4");
    public SelenideElement clickMe=$("div[class='mt-4']:nth-child(4)>[type='button']");
    public SelenideElement dynamicMessage=$("p#dynamicClickMessage");


    public Buttons(String pageUrl) {
        super(pageUrl);
    }

    public void clickToButtons(){
        buttons.click();
    }

    public void clickToClickMe(){
        clickMe.should(Condition.clickable, Duration.ofSeconds(10));
        clickMe.click();
    }

}
