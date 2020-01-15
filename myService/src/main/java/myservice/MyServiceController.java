package myservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/myService")
public class MyServiceController {
	@RequestMapping("/getUser")
    public User getUser()
    {
		User user = new User(); 
		user.setFrequentShopper(true);
		user.setName("tom");
    	return user;
    }
	
	@RequestMapping(value = "/getJson1", produces = "application/json")
    public String getJson1()
    {
		return "{\r\n" + 
				"    \"id\": \"390\",\r\n" + 
				"    \"data\": {\r\n" + 
				"        \"leagueId\": 35,\r\n" + 
				"        \"homeTeam\": \"Norway\",\r\n" + 
				"        \"visitingTeam\": \"England\",\r\n" + 
				"    },\r\n" + 
				"    \"odds\": [{\r\n" + 
				"        \"price\": \"1.30\",\r\n" + 
				"        \"name\": \"1\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"        \"price\": \"5.25\",\r\n" + 
				"        \"name\": \"X\"\r\n" + 
				"    }]\r\n" + 
				"}";
    }

}
