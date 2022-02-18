package com.cydeo.tests.day5_testing_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_intro {


    @BeforeClass
    public void setupMethod(){
        System.out.println("------------>Before class is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-------------->After class is running");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("----------> Before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("------------->After method is running");
    }

    @Test
    public void test1(){

        //Assert Equals: compare two of the same things

        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual, expected);


        System.out.println("Test 1 is running");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running");

        //AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));

    }
}
