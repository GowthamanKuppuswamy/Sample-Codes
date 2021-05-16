import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC2_POST_REQUEST {
	
	@Test
	void postDetailsintWebsite()
	{	
		//specific URI
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		
		//Specifying which type of request and creating an object
		RequestSpecification httpRequest = RestAssured.given();
				
		//Response Object
		JSONObject passParameters = new JSONObject();
		passParameters.put("FirstName", "GowthadfgdmXYZ");
		passParameters.put("LastName", "vxvdXYZ");
		passParameters.put("UserName", "GowtdhabfxmXYZ");
		passParameters.put("Password", "GowmmbcldthamxyzXYZ");
		passParameters.put("Email", "GowcthavcbgeemXYZ@gmail.com");
		
		httpRequest.header("Content-Type","application/json");
		
		httpRequest.body(passParameters.toJSONString());
		//Response Object
		Response response = httpRequest.request(Method.POST,"/register");
		
		//printing Response in Console as a stirng
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is" +responseBody);
		
		//Status code validation
		int statuscode = response.getStatusCode();
		System.out.println("The Status code is:" +statuscode);
		Assert.assertEquals(statuscode,201);
		
		//Sucess Code Validatipon
		String SuccessCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals(SuccessCode,"OPERATION_SUCCESS");
		
		 
	}
}
