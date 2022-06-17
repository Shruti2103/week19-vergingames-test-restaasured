package com.virgingames.bingoinfo;

import com.virgingames.constants.EndPoints;
import com.virgingames.constants.Path;
import com.virgingames.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Title;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Assertion extends TestBase {
    static ValidatableResponse response;


@BeforeClass
public static void inIt() {
    RestAssured.baseURI = "https://www.virgingames.com";
    RestAssured.basePath = Path.BINGO;
    RestAssured.registerParser("text/plain", Parser.JSON);
    response = given()
            .when()
            .get(EndPoints.GET_ALL_Bingo)
            .then().statusCode(200);

}



    // 1) Verify that the streameID  of Stream
    @Test
    public void test001() {
        response.body("bingoLobbyInfoResource.streams[0].streamId", equalTo(194));
    }


}
