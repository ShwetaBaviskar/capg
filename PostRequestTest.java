 package curdOperationUsingTDD;
	
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
@Test

	public class PostRequestTest extends BaseClass
	{
		 public void PostRequestTest() {
				 
			baseURI="http://localhost:8080";
			
			JSONObject obj = new JSONObject();
			obj.put("id", "15");
			obj.put("address", "Pune");
			obj.put("mail_id", "shwetab12@gmail.com");
			obj.put("name", "Shweta");
			obj.put("phone", "8989898989");
 
		     given()
			.contentType(ContentType.JSON)
			.body(obj)
			.when()
			.post("/supplier")
			
			.then()
			.assertThat()
			.body("data.address", equalTo("Pune"))
			.statusCode(200)
			.log().all();
			 }
	}
	


