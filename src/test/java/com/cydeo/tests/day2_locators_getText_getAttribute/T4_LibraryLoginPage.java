package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {

    public static void main(String[] args) {

        //http://library2.cybertekschool.com/login.html

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://library2.cybertekschool.com/login.html");

        //enter username "incorrect@email.com"
        WebElement usernameInput = driver.findElement(By.className("form-control"));//to get to email field
        usernameInput.sendKeys("incorrect@email.com"); //to enter email

        //enter password "incorrect password"
        WebElement passwordInput = driver.findElement(By.id("inputPassword")); //to get to password field
        passwordInput.sendKeys("incorrect password"); //to insert  given password

        //click to sign in:
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();









    }
}
