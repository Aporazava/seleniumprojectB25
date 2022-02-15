package com.cydeo.tests.day5_testing_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_radioButton {

    public static void main(String[] args) {

      //  TC #2: Radiobutton handling
       // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //  2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons ");

       // 3. Click to “Hockey” radio button
        WebElement radioHockeyBtn = driver.findElement(By.xpath("//input[@id='hockey']"));

        radioHockeyBtn.click();

      //  4. Verify “Hockey” radio button is selected after clicking.
        if (radioHockeyBtn.isSelected()){
            System.out.println("Button is selected, verification passed");
        }else {
            System.out.println("Button is not selected, verification failed");
        }
      //  USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS



    }
}
