import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC5_GET_REQUEST_VALIDATE_JSONBODY {
	@Test
	void validatingResponseBody()
	{	
		String substr ="maze";
		//specific URI
		RestAssured.baseURI = "https://jsonmock.hackerrank.com/api/movies/search/?Title=maze";
		
		//Specifying which type of request and creating an object
		RequestSpecification httpRequest = RestAssured.given();
				
		//Response Object
		Response response = httpRequest.request(Method.GET,substr+"");
	
		//printing Response in Console as a stirng
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is" +responseBody);
		
        JsonPath jsonPath = response.jsonPath();
		
        int total = jsonPath.get("total");
		System.out.println(total);
		
		//validating response body
		//Assert.assertEquals(responseBody.contains("haze"), true);
	}

}
