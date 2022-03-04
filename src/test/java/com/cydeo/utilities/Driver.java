package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //creating a private constructor, so we are closing access to the object of this class from outside
    private Driver(){
    }
    //we make Webdriver private, because we want to close access from outside
    //we make it static because we will use it in a static method
    private static WebDriver driver;

    //create a re-usable utility method which will return same driver instance when we call it
    public static WebDriver getDriver(){

        if (driver ==null){ //if the browser is null we want to create a new browser object below:
            String browserType =  ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver  = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox"  :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }

        }
        return driver;
    }




}
