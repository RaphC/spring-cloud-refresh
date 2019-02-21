package com.bouygtel.swad.springcloudconfigissue421;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableConfigurationProperties(MyApplicationConfigurationProperties.class)
@RestController
@EnableAutoConfiguration
public class SpringCloudConfigIssue421Application {
	
	@Autowired
	private MyApplicationConfigurationProperties configurationProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigIssue421Application.class, args);
	}
	
	@GetMapping(produces="application/json", value="/mylist")
	public List<String> getMyListe(){
		return configurationProperties.getMyList();
	}
}
