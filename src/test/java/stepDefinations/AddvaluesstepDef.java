package stepDefinations;

import org.json.JSONArray;
import org.json.JSONObject;

import Utils.Payload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AddvaluesstepDef {

	@Given("Access the API url")
	public void access_the_api_url() {

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";
		Response api_Response = RestAssured.given().log().all()
				.when().get().then().log().all().assertThat().statusCode(200)
				.extract().response();

		JSONObject js_Obj = new JSONObject(api_Response.asString());
		JSONArray js = new JSONArray();
		js =  js_Obj.getJSONArray("data");
		
		for (int i = 0; i < js.length(); i++) 
		{
				String Emp_name = js.getJSONObject(i).getString("employee_name");
				System.out.println(Emp_name);
				
				int Emp_salary = js.getJSONObject(i).getInt("employee_salary");
				System.out.println(Emp_salary);

		}

		
	}

	@Then("Add the user information to the API")
	public void add_the_user_information_to_the_api() {
		System.out.println("test2");

	}

	@Then("validate if the API response is successfull")
	public void validate_if_the_api_response_is_successfull() {
		System.out.println("test3");

	}

	@Then("validate the salary")
	public void validate_the_salary() {
		System.out.println("test4");

	}

}
