package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        //to set up browser driver

        WebDriverManager.chromedriver().setup();

        //open Chrome browser:
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //go to Yahoo
        driver.get("https://www.yahoo.com");

        //to verify title:
        String expectedTitle = "Yahoo|Mail, Weather, Seearch, Politics, News, Finance, Sports & Videos";

        //actual title comes from the browser:
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("title is as expected. Verification passed!");
        }else{
            System.out.println("Title is not as expected. Verification failed!");
        }







    }
}
