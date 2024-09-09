package in.happy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.happy.feign.GetFeignClient;

@RestController
public class WelcomeRestController {
	@Autowired
	private GetFeignClient client;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		String greet = client.invokeGreetApi();
		
//		RestTemplate rt =  new RestTemplate();
//		ResponseEntity<String> forEntity = rt.getForEntity("http://localhost:8081/greet", String.class);
//		String body = forEntity.getBody();
		
		return greet+ ", welcome to india";
	}

}

