package tests;

import com.codeborne.selenide.Condition;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ButtonsTest extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.buttons.openElements();
    }

    @Test
    public void dynamickButtonTest(){
        pageManager.buttons.clickToButtons();
        pageManager.buttons.clickToClickMe();
        pageManager.buttons.dynamicMessage.should(Condition.appear, Duration.ofSeconds(10));
        Assertions.assertThat(pageManager.buttons.dynamicMessage.getText()).isEqualTo("You have done a dynamic click");
    }
}
