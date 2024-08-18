package common;

import pages.Buttons;
import pages.WebTables;
import utilis.PropertyManager;

public class PageFactory {
    public static Buttons buildButtons(){
        return new Buttons( "/");
    }

    public static WebTables buildWebTables(){
        return new WebTables("/");
    }
}
