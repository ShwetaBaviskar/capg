package stepDefination;

import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@When("User want to get all the data by using api is {string}")
	public void user_want_to_get_all_the_data_by_using_api_is(String url) {
		res=RestAssured.get(url);
	}

	@Then("User is checks whether the status code is {int}")
	public void user_is_checks_whether_the_status_code_is(Integer int1) {
		 validate =res.then();
		   validate.assertThat().body("message", equalTo("successfull")).statusCode(int1);
		   validate.contentType(ContentType.JSON);
		   validate.log().all();
	}


}
