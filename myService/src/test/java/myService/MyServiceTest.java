package myService;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import myservice.MainApplication;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class MyServiceTest {

	@BeforeClass
	static public void startServer()
	{
		SpringApplication.run(MainApplication.class, new String[]{});	
	}
	
	@Test
	public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {
	   get("/myService/getJson1").then().statusCode(200).assertThat()
	      .body("data.leagueId", equalTo(35)); 
	}

	@Test
	public void testWithSpec()
	{
		RequestSpecification spec = new RequestSpecBuilder()
	            .setContentType(ContentType.JSON)
	            .setBaseUri("http://localhost:8080/myService").build();
		given().spec(spec).when().get("getUser").then().statusCode(200).body("name", equalTo("tom"));
	}

	
	@Test
	public void testUserNameIsTom() {
	   get("/myService/getUser").then().statusCode(200).assertThat()
	      .body("name", equalTo("tom")); 
	}
	
}
