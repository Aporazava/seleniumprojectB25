package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {
        //to open web driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //to maximize window
        driver.manage().window().maximize();

        //go to page:
        driver.navigate().to("https://practice.cydeo.com");

        //verify URL contains cydeo:
        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.contains(actualURL)){
            System.out.println("Result as expected");
        }else{
            System.out.println("verification failed");
        }

        //Verify title:

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification passed!");
        }else {
            System.out.println("Title verification failed");
        }










    }
}
