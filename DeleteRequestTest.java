package curdOperationUsingTDD;


import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

import static io.restassured.RestAssured.*;


public class DeleteRequestTest extends BaseClass {
	@Test
	public void DeleteRequestTest() {
	
	      when()
		 .delete("http://localhost:8080/supplier?id=3")
		 
		 .then()
		 .assertThat().statusCode(200)
		 .and()
		 .log().all();
		
	}
}
