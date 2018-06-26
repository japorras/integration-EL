package com.rtve.integrationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rtve.service.MyService;

@SpringBootApplication(scanBasePackages = "com.rtve")
@RestController
public class IntegrationApiApplication {

	private final MyService myService;

    public IntegrationApiApplication(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(IntegrationApiApplication.class, args);
    }
	
}
