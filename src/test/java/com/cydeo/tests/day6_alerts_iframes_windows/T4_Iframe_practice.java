package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //  1. Open browser
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //  2. Go to website: http://practice.cydeo.com/iframe
        driver.get("http://practice.cydeo.com/iframe");
    }
    @Test
    public void iframe_test(){
        //We need to switch drivers focus to iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //locate the p  tag
        WebElement yourContentGoesHere = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHere.isDisplayed());

        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.isDisplayed());




    }

}
