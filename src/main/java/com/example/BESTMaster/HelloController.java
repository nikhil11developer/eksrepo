package com.example.BESTMaster;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
   
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		String fooResourceUrl="Nikhil Srivastava the master developer";
		
		return new ResponseEntity<String>(fooResourceUrl , HttpStatus.OK);
	}
	
}
