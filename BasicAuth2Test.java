package authentication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import com.BaseClass.BaseClass;

public class BasicAuth2Test extends BaseClass {
	@Test
	public void DigestiveTest() {
		 
		baseURI="https://github.com";
		
		given().auth().preemptive().basic("ShwetaBaviskar", "Shweta@19@99");
		when().get("/login")
		.then().log().all();

}
}