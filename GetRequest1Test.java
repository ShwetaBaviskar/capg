package curdOperationUsingTDD;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

public class GetRequest1Test extends BaseClass {

	@Test
	public void getRequestTest() {
		baseURI="http://localhost:8080";
		when()
		.get("/supplier")
	
		.then()
		.assertThat()
		.body("message", equalTo("successfull"))
		.statusCode(200)
		.log().all(); 
	
	}
}