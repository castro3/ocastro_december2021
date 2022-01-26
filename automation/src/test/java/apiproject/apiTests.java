package apiproject;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

public class apiTests {
	@Test
	public void canVerifyEmailAddress() {
		get("/api/users/2").then().statusCode(200).assertThat().body("data.email", equalTo("janet.weaver@reqres.in"));
	}

	@Test
	public void canVerifyTokenValue() {
		String tokenValue = "QpwL5tke4Pnpja7X4";
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("email", "eve.holt@reqres.in");
		requestMap.put("password", "cityslicka");
		JSONObject request = new JSONObject(requestMap);

		given().body(request.toJSONString()).post("/api/login").then().statusCode(200).body("token", equalTo(tokenValue));
	}

	@Test
	public void canVerifyReponseCode204() {
		// No Content success status - status code 204
		Response response = delete("/api/users/2");
		Assert.assertEquals(204, response.getStatusCode());
	}

	@Test
	public void canUpdatePatch() {
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("name", "morpheus2");
		requestMap.put("job", "zion resident");
		JSONObject request = new JSONObject(requestMap);

		String timestamp = given().body(request.toJSONString()).when().patch("/api/users/2").then().extract()
				.path("updatedAt");

		Assert.assertNotNull(timestamp);
	}

	@Test
	public void canUpdatePut() {
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("name", "morpheus2");
		requestMap.put("job", "zion resident");

		JSONObject request = new JSONObject(requestMap);

		String timestamp = given().body(request.toJSONString()).when().put("/api/users/2").then().extract()
				.path("updatedAt");

		System.out.println(
				given().body(request.toJSONString()).when().put("/api/users/2").then().extract().asPrettyString());

		Assert.assertNotNull(timestamp);
	}
	
	@Test
	public <T> void canDeserializeSingleUser() {
		List<Map<String, T>> singleUser = get("/api/users/2").jsonPath().getList("data");
		User<T> user = new User<T>(singleUser.get(0).get("id"), singleUser.get(0).get("email"),
				singleUser.get(0).get("first_name"), singleUser.get(0).get("last_name"),
				singleUser.get(0).get("avatar"));
		Assert.assertEquals(user.getId(), "2");
		Assert.assertEquals(user.getFirst_name(), "Janet");
		Assert.assertEquals(user.getLast_name(), "Weaver");
		Assert.assertEquals(user.getEmail(), "janet.weaver@reqres.in");
		Assert.assertEquals(user.getAvatar(), "https://reqres.in/img/faces/2-image.jpg");
	}

	@Test
	public <T> void canDeserializeCollectionOfUsers() {
		List<Map<String, T>> users = get("/api/users?page=2").jsonPath().getList("data");
		List<User<T>> userList = new ArrayList<User<T>>();
		for(int i=0; i < users.size(); i++) {
			userList.add(new User<T>(users.get(i).get("id"), users.get(i).get("email"),
					users.get(i).get("first_name"), users.get(i).get("last_name"),
					users.get(i).get("avatar")));
		}
		Assert.assertNotNull(userList);
		
	}

	@BeforeMethod
	public void beforeMethod() {
		RestAssured.baseURI = "https://reqres.in/";

	}
}
