package authentication;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import com.BaseClass.BaseClass;

public class BasicAuth1Test extends BaseClass {
	@Test
	public void DigestiveTest() {
		 
		baseURI="https://github.com";
		
		given().auth().digest("ShwetaBaviskar", "Shweta@19@99");
		when().get("/login")
		.then().log().all();
		
		
		
	}

}
