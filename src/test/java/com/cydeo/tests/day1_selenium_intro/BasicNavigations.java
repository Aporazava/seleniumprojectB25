package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        driver.get("https://www.tesla.com");

        //to get a title of the web page:
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("CurrentURL = " +currentURL);

        //to stop code execution for 3 seconds:
        Thread.sleep(3000);

        //use selenium to navigate back:
        driver.navigate().back();

        //to stop code execution for 3 seconds:
        Thread.sleep(3000);

        //to navigate forward:
        driver.navigate().forward();

        //to stop code execution for 3 seconds:
        Thread.sleep(3000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get the current title after getting to google  page:
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " +currentTitle);

        //to get current URL using selenium:
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = "+currentURL);

        //to close the currently opened window
        driver.close();

        //to close all  opened windows
        driver.quit();










    }

}
