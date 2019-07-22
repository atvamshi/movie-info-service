package io.uv.movieinfoservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
@EnableEurekaClient
public class MovieInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}


//	@PostMapping(path = "/test", consumes = MediaType.TEXT_XML_VALUE)
//	public void post(@RequestBody String request){
//		log.info("*******************************");
//		log.info(request);
//		log.info("*******************************");
//	}

}
