package com.virgingames.testbase;




import com.virgingames.constants.Path;

import groovy.beans.PropertyReader;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.junit.BeforeClass;

/**
 * Created by Shruti
 */
public class TestBase {
    public static PropertyReader propertyReader;


        @BeforeClass
        public static void inIt() {
            RestAssured.baseURI="https://www.virgingames.com";
            RestAssured.basePath = "/bingo";
            RestAssured.registerParser("text/plain", Parser.JSON);
    }

}
