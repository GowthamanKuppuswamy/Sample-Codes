import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDrivenTest_AddNewEmployee {
	
	@SuppressWarnings("unchecked")
	@Test
	void postNewEmployees()
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		
		RequestSpecification httpRequest =RestAssured.given();
		
		JSONObject passParams = new JSONObject();
		
		passParams.put("name","Gowtham123");
		passParams.put("salary", "200000");
		passParams.put("age", "23");
		
		httpRequest.header("Content-type","application/json");
		
		httpRequest.body(passParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST,"/create");
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is" +responseBody);
		
		
		Assert.assertEquals(responseBody.contains("Gowtham123"),true);
		Assert.assertEquals(responseBody.contains("200000"),true);
		Assert.assertEquals(responseBody.contains("23"),true);
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		
		
	}

}
