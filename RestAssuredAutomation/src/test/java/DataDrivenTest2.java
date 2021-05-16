import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDrivenTest2 {
	
	@SuppressWarnings("unchecked")
	@Test(dataProvider="empdataProvider")
	void postNewEmployees(String ename, String eage, String esal)
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		
		RequestSpecification httpRequest =RestAssured.given();
		
		JSONObject passParams = new JSONObject();  
		
		passParams.put("name",ename);
		passParams.put("salary", eage);
		passParams.put("age", esal);
		
		httpRequest.header("Content-type","application/json");
		
		httpRequest.body(passParams.toJSONString());
		
		Response response = httpRequest.request(Method.POST,"/create");
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is" +responseBody);
		
		//System.out.println(responseBody);
		Assert.assertEquals(responseBody.contains(ename),true);
		Assert.assertEquals(responseBody.contains(esal),true);
		Assert.assertEquals(responseBody.contains(eage),true);
		
		
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,200);
		
		
	}
	
	@DataProvider(name="empdataProvider")
	String [][]getempData()
	{
		String empData[][]= {{"abc123","20000","23"}};
		return (empData);
	}

}
