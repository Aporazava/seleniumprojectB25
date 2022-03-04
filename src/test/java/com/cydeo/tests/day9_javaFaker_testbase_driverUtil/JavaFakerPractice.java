package com.cydeo.tests.day9_javaFaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {


    @Test
    public void test1(){

        Faker faker = new Faker();

        //method will return random name
        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        //method will return random phone number
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        //method will return random letters in format we write as ?
        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));

        //method will return(create) random data, used to create ID, ticket numbers and so on
        System.out.println("faker.bothify(\"##?-##?#-#?#?#-##??\") = " + faker.bothify("##?-##?#-#?#?#-##??"));


        System.out.println("faker.finance().creditCard().replaceAll() = "
                + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\",\"Muhtar\") = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));


    }


}
