package stepDefination;

import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetByID {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@When("User is able to get single data with the help of using api is {string}")
	public void user_is_able_to_get_single_data_with_the_help_of_using_api_is(String url) {
	    res=RestAssured.get(url);
	}

	@Then("To checking the Status code as {int}")
	public void to_checking_the_status_code_as(Integer int1) {
		 validate = res .then();
		 validate.assertThat().body("message", equalTo("successfull")).statusCode(200);
		 validate.log().all();
	}

}
