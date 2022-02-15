package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get(" https://login1.nextbasecrm.com/?forgot_password=yes ");

        //verify "Reset password" button text is expected: Reset password
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));


    }
}
