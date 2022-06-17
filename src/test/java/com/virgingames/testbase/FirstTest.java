package com.virgingames.testbase;


import com.virgingames.constants.EndPoints;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;

public class FirstTest extends TestBase {
    @Test
    public void getSingleUser() {
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_Bingo)
               .then();


    }
}