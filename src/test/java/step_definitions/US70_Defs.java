package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US70_Defs {

   Response response = null;

   RequestSpecification request = new RequestSpecBuilder()
           .setBaseUri(ConfigurationReader.getProperty("api_url"))
           .build();

   // JSONObject jsonObject = new JSONObject();

    @And("the user login with {string} and {string}")
    public void theUserLoginWithAnd(String email, String sifre) {

        JSONObject requestParams = new JSONObject();
        requestParams.put("email", email);
        requestParams.put("sifre", sifre);

        response = given()
                .contentType(ContentType.JSON)
                .spec(request)
                .body(requestParams.toString())
                .post("/user/account/login");

        response.prettyPrint();

        /*
        RestAssured.baseURI = ConfigurationReader.getProperty("api_url");
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("email", email);
        requestParams.put("sifre", sifre);

        request.body(requestParams.toString());
         response = request
                .contentType(ContentType.JSON)
                .post("/user/account/login");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

         */


    }

    @When("the user send post request to {string}")
    public void theUserSendPostRequestTo(String endPoint) {

    }

    @Then("the user verifies the status code is {int}")
    public void theUserVerifiesTheStatusCodeIs(int expectedStatusCode) {

        System.out.println("response.statusCode() = " + response.statusCode());
        if (response.statusCode()==200){
            Assert.assertEquals(expectedStatusCode, response.statusCode());
        }else {
            Assert.assertEquals(expectedStatusCode, response.statusCode());
        }
        System.out.println("response.contentType() = " + response.contentType());
    }

    @And("the user verifies response body contains following data")
    public void theUserVerifiesResponseBodyContainsFollowingData(List<String> expectedBodyData) {
        System.out.println("expectedBodyData.size() = " + expectedBodyData.size());
        System.out.printf("expectedBodyData = ", expectedBodyData);

        JsonPath jsonPath = response.jsonPath();
        jsonPath.getString("token");
      //  jsonPath.getString("sonuc");
        //List<String> list = jsonPath.getList(string);

       for (String dt : expectedBodyData) {

           assertTrue(response.getBody().asString().contains(dt));
           System.out.println("dt = " + dt);

       }
    }

    @And("the user verifies response body contains {string}")
    public void theUserVerifiesResponseBodyContains(String expectedData) {

        assertTrue(response.getBody().asString().contains(expectedData));
    }
}
