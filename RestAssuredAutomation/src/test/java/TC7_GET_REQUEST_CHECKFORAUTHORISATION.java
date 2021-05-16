import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC7_GET_REQUEST_CHECKFORAUTHORISATION {
	@Test
	void validatingAuthorisation()
	{	
		//specific URI
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckforAuthentication/";
		
		//Basic Authentication
		PreemptiveBasicAuthScheme authscheme = new PreemptiveBasicAuthScheme();
		authscheme.setUserName("ToolsQA");
		authscheme.setPassword("TestPassword");
		
		RestAssured.authentication = authscheme;
		
		//Specifying which type of request and creating an object
		RequestSpecification httpRequest = RestAssured.given();
				
		//Response Object
		Response response = httpRequest.request(Method.GET,"/");
		
		//Status code validation
				int statuscode = response.getStatusCode();
				System.out.println("The Status code is:" +statuscode);
				Assert.assertEquals(200, statuscode);
				 
				//status line verfication
				String statusLine = response.getStatusLine();
				System.out.println("The status Line is:" +statusLine);
				Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		//printing Response in Console as a stirng
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is" +responseBody);
		
		
	}

}
