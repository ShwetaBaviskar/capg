package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
public class DeleteRequest {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@When("I hit the api with delete request and end point as  {string}")
	public void i_hit_the_api_with_delete_request_and_end_point_as(String deleteurl) {
	res=when().delete(deleteurl);
	}

	@Then("To checking the Status code as {int} and status line as {string}")
	public void to_checking_the_status_code_as_and_status_line_as(Integer int1, String string) {
	  res.then()
	  .assertThat().statusCode(200)
	  //.assertThat().statusLine("HTTP/1.1 200")
	   .log().all();
	  
	}
}
