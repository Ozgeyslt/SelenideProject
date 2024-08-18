package tests;

import com.codeborne.selenide.Condition;
import driver.DriverFactory;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesTest extends  BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.webTables.openWebTables();
    }

    @Test
    public void editWebTables(){
        pageManager.webTables.clickToButtons();
        pageManager.webTables.fillTheForm();
        pageManager.webTables.editForm();
        pageManager.webTables.editName();
        pageManager.webTables.editedRow.should(Condition.visible);
        Assertions.assertThat(pageManager.webTables.editedRow.getText()).isEqualTo("Merve");
    }

}
