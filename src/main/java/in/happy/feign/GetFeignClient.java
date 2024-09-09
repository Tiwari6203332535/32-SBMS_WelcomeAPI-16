package in.happy.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="34-SBMS-GreetAPI-16")

public interface GetFeignClient {
	
	@GetMapping("/greet")
	
	 // String invokeGreetApi();

	String invokeGreetApi();
	

}
