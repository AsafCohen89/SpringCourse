package myservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
