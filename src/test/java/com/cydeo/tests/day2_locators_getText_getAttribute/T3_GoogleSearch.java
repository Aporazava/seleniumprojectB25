package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //!!!!  write "apple" in a search box
        WebElement googleSearchBox = driver.findElement(By.name("q")); //q is a search box element name
        googleSearchBox.sendKeys("apple" + Keys.ENTER); //keys.ENTER is to hit enter automatically

        //verify title

        String expectedInTitle = "apple";
        String actualInTitle = driver.getTitle();

        if (actualInTitle.startsWith(expectedInTitle)){
            System.out.println("verification passed");
        }else{
            System.out.println("verification failed");
        }




    }
}
