package authentication;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
public class PostAuthenticationToken {
    
	public static void main(String[] args) {
		
		baseURI="https://api.github.com";
		
		JSONObject obj= new JSONObject();
		obj.put("name", "BasicAut");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();

}
}
