import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC4_GET_REQUEST_ALLHEADERS {
	@Test
	void getgoogleMapDetailsallHeaders()
	{	
		//specific URI
		RestAssured.baseURI = "https://maps.googleapis.com";
		
		//Specifying which type of request and creating an object
		RequestSpecification httpRequest = RestAssured.given();
				
		//Response Object
		Response response = httpRequest.request(Method.GET,"maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s");
		
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
		
		  //validating all headers
		
	     Headers allHeaders = response.headers();
	     
	     for(Header header:allHeaders)
	     {
	    	 System.out.println(header.getName()+":    "+header.getValue());
	     }
		  
	}

}
