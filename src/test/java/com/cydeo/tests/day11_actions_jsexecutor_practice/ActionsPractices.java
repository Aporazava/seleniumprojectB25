package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void task_4_and_5_test(){

        Driver.getDriver().get("https://practice.cydeo.com/");


        //create object of Actions and pass our driver instance
        Actions actions = new Actions(Driver.getDriver());


        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.moveToElement(cydeoLink).perform();

        //scroll back up  to "Home" link using PageUp button
        actions.sendKeys(Keys.PAGE_UP).perform();

        Driver.getDriver().quit();

    }

    @Test
    public void test2(){

        Driver.getDriver().get("https://practice.cydeo.com/");



    }




}
