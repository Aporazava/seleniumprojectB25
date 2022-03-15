package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    @Test
    public void t1_double_click_test(){

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //switch to iframe:
        Driver.getDriver().switchTo().frame("iframeResult"); // id locator

        //Double-click on the text "Double click me to change the color":
        DoubleClickPage doubleClickPage = new DoubleClickPage();
        Actions actions  = new Actions(Driver.getDriver());

        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();

        //Assert: Text's "style" attribute value contains "red"
        System.out.println("doubleClickPage.textToDoubleClick.getAttribute(\"style\")  = "
                + doubleClickPage.textToDoubleClick.getAttribute("Style"));

        String actualAttributeValue = doubleClickPage.textToDoubleClick.getAttribute("style");
        String expectedAttributeValue = "red";










    }
}
