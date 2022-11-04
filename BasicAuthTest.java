package authentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import com.BaseClass.BaseClass;

public class BasicAuthTest extends BaseClass {
	@Test
	public void BasicauthTest() {
		 
		baseURI="https://github.com";
		
		given().auth().basic("ShwetaBaviskar", "Shweta@19@99");
		when().get("/login")
		.then().log().all();
		
		
		
	}

}
