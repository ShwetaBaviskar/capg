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

public class PutRequest {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("user wants to upadate the existing the data")
	public void user_wants_to_upadate_the_existing_the_data() {
		JSONObject obj = new JSONObject();
		obj.put("address", "Pune");
		obj.put("name", "shwetu");

		req=RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
	}

	@When("User wants to update the data using api {string}")
	public void user_wants_to_update_the_data_using_api(String url) {
		res=req.put(url);
	}
	
	@Then("Verify the Status code is {int}")
	public void verify_the_status_code_is(Integer int1) {
		validate =res.then();
		  validate.assertThat().body("message", equalTo("successfull")).statusCode(int1);
		   validate.log().all();
	}	
	
	}

