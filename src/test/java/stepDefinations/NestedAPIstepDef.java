package stepDefinations;

import org.json.JSONArray;
import org.json.JSONObject;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NestedAPIstepDef {
	
	private Scenario scenario;
	
	@Before
	public void initiatScenario( Scenario scenario) {
		this.scenario = scenario;
		
	}

	@Given("Verify nested API")
	public void verify_nested_api() {

		RestAssured.baseURI = "https://www.gov.uk/bank-holidays.json";

		Response res = RestAssured.given().log().all()
				.when().get()
				.then().assertThat().statusCode(200).extract().response();
		

		JSONObject countries = new JSONObject(res.asString());

		JSONObject england = getJSONObjectOfKey(countries, "england-and-wales");
		JSONObject scotland = getJSONObjectOfKey(countries, "scotland");
		JSONObject northen_ireland = getJSONObjectOfKey(countries, "northern-ireland");

		JSONArray events_in_England = getCountryEvents(england, "events");
		JSONArray events_in_scotland = getCountryEvents(scotland, "events");
		JSONArray events_in_northen_ireland = getCountryEvents(northen_ireland, "events");

		String england_Division = getDivisionName(england, "division");
		String scotland_Division = getDivisionName(scotland, "division");
		String northen_ireland_Division = getDivisionName(northen_ireland, "division");

		int Englandfalserecordcount = 0;
		int Scotlandfalserecordcount = 0;
		int Irelandfalserecordcount = 0;

		if (england_Division.equalsIgnoreCase("england-and-wales")) {

			for (int i = 0; i < events_in_England.length(); i++) {

				JSONObject allEventsInEngland = events_in_England.getJSONObject(i);

				String title = (String) allEventsInEngland.get("title");
				Boolean buntingFlag = allEventsInEngland.getBoolean("bunting");

				if (buntingFlag == false) {
					System.out.println("England false Events ----" + title + "----" + buntingFlag);
					Englandfalserecordcount++;
					
					scenario.log("England false Events ----" + title + "----" + buntingFlag);
				}

			}
			System.out.println("------------------------------------------------");
			System.out.println("England false event ----" + Englandfalserecordcount);
			

		}

		System.out.println("------------------------------------------------");

		if (scotland_Division.equalsIgnoreCase("scotland")) {

			for (int i = 0; i < events_in_scotland.length(); i++) {

				JSONObject allEventsInScotland = events_in_scotland.getJSONObject(i);
				// JSONObject allEventsInScotland = getAllEventsData(events_in_scotland);
				String title = (String) allEventsInScotland.get("title");
				Boolean buntingFlag = allEventsInScotland.getBoolean("bunting");

				if (buntingFlag == false) {
					System.out.println("Scotland false Events ----" + title + "----" + buntingFlag);
					Scotlandfalserecordcount++;
					
					scenario.log("Scotland false Events ----" + title + "----" + buntingFlag);
				}
			}
			System.out.println("------------------------------------------------");
			System.out.println("Scotland false event ----" + Scotlandfalserecordcount);

		}
		System.out.println("------------------------------------------------");

		if (northen_ireland_Division.equalsIgnoreCase("northern-ireland")) {

			for (int i = 0; i < events_in_northen_ireland.length(); i++) {

				JSONObject allEventsInIreland = events_in_northen_ireland.getJSONObject(i);
				// JSONObject allEventsInIreland = getAllEventsData(events_in_northen_ireland);
				String title = (String) allEventsInIreland.get("title");
				Boolean buntingFlag = allEventsInIreland.getBoolean("bunting");

				if (buntingFlag == false) {
					System.out.println("Ireland false Events ----" + title + "----" + buntingFlag);
					Irelandfalserecordcount++;
					
					scenario.log("Ireland false Events ----" + title + "----" + buntingFlag);
				}
			}
			System.out.println("------------------------------------------------");
			System.out.println("Ireland false event ----" + Irelandfalserecordcount);

		}

	}

	public JSONObject getJSONObjectOfKey(JSONObject obj, String key) {

		return obj.getJSONObject(key);
	}

	public JSONArray getCountryEvents(JSONObject countryname, String event) {

		return countryname.getJSONArray(event);
	}

	public String getDivisionName(JSONObject country, String division) {

		System.out.println("Test AT");
		return country.getString(division);
		

	}


}
