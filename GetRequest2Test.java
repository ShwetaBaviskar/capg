package curdOperationUsingTDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

import io.restassured.http.ContentType;

public class GetRequest2Test  extends BaseClass { 
	@Test 
	public void getRequestTest() {
		 
		when()
 	    .get("http://localhost:8080/supplier?id=5")

		.then() 
		.assertThat()
		.body("message", equalTo("successfull"))
		.statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.log().all();

	}
}