import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC1_GET_REQUEST {

	@Test
	void getWeatherDetails()
	{	
		//specific URI
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		//Specifying which type of request and creating an object
		RequestSpecification httpRequest = RestAssured.given();
				
		//Response Object
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		
		//printing Response in Console as a stirng
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is" +responseBody);
		
		//Status code validation
		int statuscode = response.getStatusCode();
		System.out.println("The Status code is:" +statuscode);
		Assert.assertEquals(200, statuscode);
		 
		//status line verfication
		String statusLine = response.getStatusLine();
		System.out.println("The status Line is:" +statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
	 
}
