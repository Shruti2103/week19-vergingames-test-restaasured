package com.virgingames.bingoinfo;


import com.virgingames.constants.EndPoints;
import com.virgingames.testbase.TestBase;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import net.serenitybdd.rest.SerenityRest;


import org.junit.BeforeClass;
import org.junit.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

/**
 * Created by Shruti
 */

public class VirginCURDTestWithSteps extends TestBase {


    @Test
    public void getAllGames() {
        Response response = given()
                .when()
                .get(EndPoints.GET_ALL_Bingo);
        response.then().statusCode(200);
        response.prettyPrint();
    }
    //bingoLobbyInfoResource[]streams[0].streamId




}
