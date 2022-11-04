package curdOperationUsingTDD;

import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import com.BaseClass.BaseClass;

import io.restassured.http.ContentType;

 
@Test
	
	public class PutRequestTest extends BaseClass
	{
		 public void PostRequestTest() {
			
			JSONObject obj = new JSONObject();
			obj.put("address", "Pune");
			obj.put("name", "shwetu");
			
			given()
			.contentType(ContentType.JSON) 
			.body(obj)
			.when()
			.put("http://localhost:8080/supplier/10")
	
			.then()
			.assertThat()
			.body("message", equalTo("successfull"))
			.statusCode(200)
			.log().all();
			 }
	}
	



