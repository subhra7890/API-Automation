package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Group;
import pojo.Link;
import pojo.Root;
import pojo.RootSortGroup;
import resources.TestData;
import resources.Utilities;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Step {
	RequestSpecification res;
	Response response;
	Utilities util= new Utilities();
	
	
	@Given("user adds base uri and query parameter")
	public void user_adds_base_uri_and_query_parameter() throws IOException {
		res=given().spec(util.requestSpecification()).
				queryParam("organization_guid",util.getGlobalValue("orgId"));
	}
		
	@Then("API call return status code as {string}")
	public void api_call_return_status_code_as(String input) {
	    int code=Integer.parseInt(input);
	    assertEquals(code, response.getStatusCode());
	}

	@Given("user add body details with {string}, {string}, {string} and  tags {string}")
	public void user_add_body_details_with_and_tags(String url, String id, String title, String tags) throws IOException {
		
		TestData test=new TestData();
		res=given().spec(util.requestSpecification()).header("Content-Type","application/json").
				body(test.postBodyTestData(url, id, title, tags));
	}
	
	@When("user calls {string} request")
	public void user_calls_request(String apiRequest) throws IOException {
		if(apiRequest.equalsIgnoreCase("POST"))
		{
			response=res.when().post(util.getGlobalValue("APIPOST")).then().extract().response();
		}
		if(apiRequest.equalsIgnoreCase("GET"))
		{
			response=res.when().get(util.getGlobalValue("APIGET")).then().extract().response();
		}	   
	}
	
	@Given("user adds base url and {string},  {int} and {string} as query parameters")
	public void user_adds_base_url_and_and_as_query_parameters(String month, Integer input, String date) throws IOException {
		res=given().spec(util.requestSpecification()).
				queryParam("unit", month).
				queryParam("units", input).
				queryParam("unit_reference", date);
	}
	
	@When("user calls {string} request with groupID {string}")
	public void user_calls_request_with_group_id(String request, String groupId) throws IOException {
		response=res.when().get(util.getGlobalValue("APIGET")+"/"+groupId+"/"+"bitlinks/clicks").
				then().extract().response();
	}
	
	@Then("validate {string},{string} and {string} available in response under link,createdBy and tags field")
	public void validate_and_available_in_response_under_link_created_by_and_tags_field(String link, String name, String tags) {
		RootSortGroup rsg=response.as(RootSortGroup.class);
		List<Link> linkList=rsg.getLinks();
		String responseName=linkList.get(0).getCreated_by();
		String responseLink=linkList.get(0).getLink();
		List<String> tagList=linkList.get(0).getTags();
		assertTrue(responseName.equals(name));
		assertTrue(responseLink.contains(link));
		String[] split=tags.split(",");
		ArrayList<String> expectedList=new ArrayList<>(Arrays.asList(split));
		assertTrue(tagList.equals(expectedList));
	}
	
	@Then("validate {string},{string} available in response")
	public void validate_available_in_response(String name, String groupId) {
		Root root=response.as(Root.class);
		List<Group> g=root.getGroups();
		String responseName=g.get(0).getName();
		String responseId= g.get(0).getGuid();
		assertTrue(responseName.equals(name));
		assertTrue(responseId.equals(groupId));	    
	}
	
	@Then("verify shortlink is created with {string}")
	public void verify_shortlink_is_created_with(String link) {
		String actual=util.retrieveJsonResponse(response,"link");
		assertTrue(actual.contains(link));
	}
}
