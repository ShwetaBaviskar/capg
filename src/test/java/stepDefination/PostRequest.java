package stepDefination;


import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest{
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("User want to provide data")
	public void user_want_to_provide_data() {
		JSONObject obj = new JSONObject();
		obj.put("id", "60");
		obj.put("address", "Pune");
		obj.put("mail_id", "shwetab12@gmail.com");
		obj.put("name", "Shweta");
		obj.put("phone", "8989898989");

		req=RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
	    
	}

	@When("User post the data by using api is {string}")
	public void user_post_the_data_by_using_api_is(String url) {
	    res=req.post(url);
	}

	@Then("User want to checks the Status code is {int}")
	public void user_want_to_checks_the_status_code_is(Integer int1) {
	   validate =res.then();
	   validate.assertThat().body("data.address", equalTo("Pune")).statusCode(int1);
	   validate.contentType(ContentType.JSON);
	   validate.log().all();
	}
}

