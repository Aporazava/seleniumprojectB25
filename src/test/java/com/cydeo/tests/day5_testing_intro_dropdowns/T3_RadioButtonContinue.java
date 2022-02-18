package com.cydeo.tests.day5_testing_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButtonContinue {
    public static void main(String[] args) {

      //  1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //  2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

      //  3. Locate name = 'sports' radio buttons and store them in a list of web element
        List<WebElement> sportRadioButtons = driver.findElements(By.name("sports"));

        for (WebElement each : sportRadioButtons){
            String eachId = each.getAttribute("id");

            System.out.println("eachId = "+eachId);

            if (eachId.equals("hockey")){
                each.click();
                break;
            }

        }
        //  4. Verify “Hockey” radio button is selected after clicking.

      //  USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    }


        private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){

    }



}
